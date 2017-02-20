package sample;

import javafx.fxml.Initializable;
import javafx.scene.control.Label;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URL;
import java.util.Properties;
import java.util.ResourceBundle;

public class Controller implements Initializable {
    public Label labelName;
    public Label labelExcep;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        ResourceBundle resourceBundle = ResourceBundle.getBundle("sample/resourses/prop");
        Properties properties = new Properties();
        try {
            properties.load(Main.class.getResourceAsStream("resourses/prop.properties"));
            properties.setProperty("ddd", "dsdsdsdsdsd");
            properties.store(new FileOutputStream(Main.class.getResourceAsStream("resourses/prop.properties").toString()), null);

        } catch (IOException e) {
            labelExcep.setText(e.getMessage());
            e.printStackTrace();
        }

        labelName.setText(properties.get("ddd").toString());

//        System.out.println(resources.getString("last"));
    }
}
