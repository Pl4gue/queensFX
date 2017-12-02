package io.github.pl4gue.controller;

import io.github.pl4gue.game.Game;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;


public class PanelController {
    @FXML
    TextArea textarea_results;

    @FXML
    TextField textfield_queenamount;

    @FXML
    protected void solve() {
        Game game = new Game();
        game.init(Integer.parseInt(textfield_queenamount.getText()));
        game.solveNQueens(true);
        String result=game.getResultString();
        textarea_results.setText(result);
    }
}
