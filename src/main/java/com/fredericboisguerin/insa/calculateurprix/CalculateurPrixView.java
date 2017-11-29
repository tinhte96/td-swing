package com.fredericboisguerin.insa.calculateurprix;

import static java.awt.BorderLayout.EAST;
import static java.awt.BorderLayout.SOUTH;
import static java.awt.BorderLayout.WEST;
import static javax.swing.JOptionPane.ERROR_MESSAGE;
import static javax.swing.JOptionPane.showMessageDialog;

import java.awt.*;
import java.text.NumberFormat;

import javax.swing.*;

public class CalculateurPrixView extends JFrame {

    private final CalculateurPrixPresenter presenter;
    private JTextField prixArticleTextField;
    private JTextField quantiteTextField;
    private JFormattedTextField montantHTTextField;
    private JFormattedTextField montantTTCTextField;

    public CalculateurPrixView() throws HeadlessException {
        super("Calculateur de prix");
        this.presenter = new CalculateurPrixPresenter(this);

        JLabel prixArticleLabel = new JLabel("Prix d'un article (€) : ");
        prixArticleTextField = new JTextField(10);
        prixArticleLabel.setLabelFor(prixArticleTextField);
        prixArticleTextField.setToolTipText("Entrez ici le montant d'un article");

        JLabel quantiteLabel = new JLabel("Quantite : ");
        quantiteTextField = new JTextField(10);
        quantiteLabel.setLabelFor(quantiteTextField);
        quantiteTextField.setToolTipText("le nombre d'articles");

        JLabel montantHTLabel = new JLabel("Montant HT : ");
        montantHTTextField = new JFormattedTextField(NumberFormat.getCurrencyInstance());
        montantHTTextField.setValue(15);
        montantHTTextField.setEditable(false);
        montantHTLabel.setLabelFor(montantHTTextField);

        JLabel montantTTCLabel = new JLabel("Montant TTC : ");
        montantTTCTextField = new JFormattedTextField(NumberFormat.getCurrencyInstance());
        montantTTCTextField.setValue(18);
        montantTTCTextField.setEditable(false);
        montantHTLabel.setLabelFor(montantTTCTextField);

        JButton computeButton = new JButton("Calculer");
        computeButton.addActionListener(e -> this.presenter.onComputeButtonClicked(this.prixArticleTextField.getText(),this.quantiteTextField.getText());


        JPanel contentPane = new JPanel();
        setContentPane(contentPane);
        contentPane.add(prixArticleTextField);

        JPanel labelPane = new JPanel(new GridLayout(0, 1));
        labelPane.add(prixArticleLabel);
        labelPane.add(quantiteLabel);
        labelPane.add(montantHTLabel);
        labelPane.add(montantTTCLabel);

        JPanel fieldPane = new JPanel(new GridLayout(0, 1));
        fieldPane.add(prixArticleTextField);
        fieldPane.add(quantiteTextField);
        fieldPane.add(montantHTTextField);
        fieldPane.add(montantTTCTextField);

        contentPane.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
        add(labelPane, WEST);
        add(fieldPane, EAST);
        add(computeButton, SOUTH);

        prixArticleTextField.requestFocus();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public void afficherErreur(String message) {
        showMessageDialog(this, message, "Erreur", ERROR_MESSAGE);
    }

    public void setMontantHTTextField(Double n){
        this.montantHTTextField.setValue(n);
    }

    public void setMontantTTCTextField(Double n){
        this.montantTTCTextField.setValue(n);
    }

    public String getprixArticle(){
        return this.prixArticleTextField.getText();
    }

    public String get

    public void display() {
        this.pack();
        this.setVisible(true);
        this.setLocationRelativeTo(null);
    }
}
