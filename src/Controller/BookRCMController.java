package Controller;

import Model.Book;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class BookRCMController {
    @FXML
    private Label authorName;

    @FXML
    private ImageView bookImage;

    @FXML
    private Label bookName;

    public void setData(Book book){
        Image image = new Image(getClass().getResourceAsStream(book.getImageSrc()));
        bookImage.setImage(image);
        authorName.setText(book.getAuthor());
        bookName.setText(book.getName());
    }
}
