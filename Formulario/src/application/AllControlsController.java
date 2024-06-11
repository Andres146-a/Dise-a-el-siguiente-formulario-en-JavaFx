package application;

import javafx.fxml.FXML;
import javafx.scene.control.*;

public class AllControlsController {

    @FXML
    private CheckBox checkBoxTerminos;

    @FXML
    private Hyperlink hyperlinkTerminos;

    @FXML
    private ToggleButton toggleButtonEstado;

    @FXML
    private RadioButton radioButtonMasculino;

    @FXML
    private RadioButton radioButtonFemenino;

    @FXML
    private Label labelInformacion;

    @FXML
    private PasswordField passwordFieldContraseña;

    @FXML
    private void initialize() {
        // Agregar la lógica aquí
        checkBoxTerminos.setOnAction(event -> {
            if (checkBoxTerminos.isSelected()) {
                labelInformacion.setText("Términos aceptados");
            } else {
                labelInformacion.setText("");
            }
        });

        hyperlinkTerminos.setOnAction(event -> {
            // Agregar la lógica para el Hyperlink aquí
        });

        toggleButtonEstado.setOnAction(event -> {
            if (toggleButtonEstado.isSelected()) {
                labelInformacion.setText("Botón activado");
            } else {
                labelInformacion.setText("Botón desactivado");
            }
        });

        radioButtonMasculino.setOnAction(event -> {
            if (radioButtonMasculino.isSelected()) {
                labelInformacion.setText("Género: Masculino");
            }
        });

        radioButtonFemenino.setOnAction(event -> {
            if (radioButtonFemenino.isSelected()) {
                labelInformacion.setText("Género: Femenino");
            }
        });

        passwordFieldContraseña.textProperty().addListener((observable, oldValue, newValue) -> {
            // Agregar la lógica para la contraseña aquí
        });
    }
}
