package com.fredericboisguerin.insa.calculateurprix;

public class CalculateurPrixPresenter {
    private final CalculateurPrixView calculateurPrixView;

    public CalculateurPrixPresenter(CalculateurPrixView calculateurPrixView) {
        this.calculateurPrixView = calculateurPrixView;
    }

    public void onComputeButtonClicked(String montantArticle, String quantite) {
        calculateurPrixView.setMontantHTTextField(Double.parseDouble(montantArticleAsText));
        calculateurPrixView.setMontantTTCTextField(Double.parseDouble(montantArticleAsText)*1.2);
    }

    private String CalculMontantHT(){
        Double prixarticle = Double.parseDouble(calculateurPrixView.getPrixArticleTextField());
        Double quantite = Double.parseDouble(calculateurPrixView.getQuantiteTextField());
        return String.valueOf(prixarticle*quantite);
    }

    private String CalculMontantTTC(){
        Double prixarticle = Double.parseDouble(this.prixArticleTextField.getText());
        Double quantite = Double.parseDouble(this.quantiteTextField.getText());
        return String.valueOf(prixarticle*quantite);
    }


}
