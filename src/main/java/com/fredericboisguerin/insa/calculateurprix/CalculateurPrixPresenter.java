package com.fredericboisguerin.insa.calculateurprix;

public class CalculateurPrixPresenter {
    private final CalculateurPrixView calculateurPrixView;

    public CalculateurPrixPresenter(CalculateurPrixView calculateurPrixView) {
        this.calculateurPrixView = calculateurPrixView;
    }

    public void onComputeButtonClicked(String montantArticle, String quantite) {
        try {
            calculateurPrixView.setMontantHTTextField(Double.parseDouble(CalculMontantHT(montantArticle, quantite)));
            calculateurPrixView.setMontantTTCTextField(Double.parseDouble(CalculMontantTTC(montantArticle, quantite)));
        } catch (Exception e) {
            calculateurPrixView.afficherErreur("Entrer un nombre pour prix et un nombre entier pour quantité svp : ");
        }
    }

    private String CalculMontantHT(String prixArticleText, String quantiteText){
        Double prixArticle = Double.parseDouble(prixArticleText);
        int quantite = Integer.parseInt(quantiteText);
        return String.valueOf(prixArticle*quantite);
    }

    private String CalculMontantTTC(String prixArticleText, String quantiteText) {
        Double tax = calculateurPrixView.getPaysComboboxText().getTax();
        Double prixArticle = Double.parseDouble(prixArticleText);
        int quantite = Integer.parseInt(quantiteText);
        return String.valueOf(prixArticle * quantite * tax);
    }
}
