
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class HelloFX extends Application {

    @Override
    public void start(Stage stage) {


        if (System.getProperty("os.name").contains("Mac")) {
            System.setProperty("apple.laf.useScreenMenuBar", "true");
        }





        MenuBar menuBar = new MenuBar();
        final String os = System.getProperty("os.name");
        if (os != null && os.startsWith("Mac"))
            menuBar.useSystemMenuBarProperty().set(true);
        Menu menu1 = new Menu("Menu 1");
        menuBar.getMenus().add(menu1);
        BorderPane borderPane = new BorderPane();
        borderPane.setTop(menuBar);




        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);

        Label userName = new Label("User Name:");
        grid.add(userName, 0, 1);
        Scene scene = new Scene(borderPane, 640, 480);
        stage.setTitle("Salut");
        stage.setResizable(false);
//        scene.getCamera();
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }

}