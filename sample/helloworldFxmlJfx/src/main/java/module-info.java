module com.mycompany.helloworldfxmljfx {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mycompany.helloworldfxmljfx to javafx.fxml;
    exports com.mycompany.helloworldfxmljfx;
}
