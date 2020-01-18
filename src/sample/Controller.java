package sample;

import javafx.fxml.FXML;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import org.opencv.core.Mat;
import org.opencv.imgcodecs.Imgcodecs;

public class Controller {
    @FXML
    ImageView imageView = new ImageView();
    Mat mat = new Mat();

    @FXML
    protected void onMouseClicked(){
        Imgcodecs codecs = new Imgcodecs();
        mat = codecs.imread("\\img.jpg");
      //  Imgcodecs.imwrite("\\prd.jpg",mat);
        imageView.setImage(new Image("img.jpg"));
    }

    }

