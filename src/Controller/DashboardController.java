package Controller;

import Model.Book;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.layout.HBox;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class DashboardController implements Initializable {
    @FXML
    private HBox cardLayout;

    private ArrayList<Book> recentlyAdded;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        recentlyAdded = new ArrayList<>(recentlyAdded());
        try {
            for (int i = 0; i < recentlyAdded.size(); i++) {
                FXMLLoader fxmlLoader = new FXMLLoader();
                fxmlLoader.setLocation(getClass().getResource("/View/card.fxml"));


                HBox cardBox = fxmlLoader.load();
                CardController cardController = fxmlLoader.getController();
                cardController.setData(recentlyAdded.get(i));
                cardLayout.getChildren().add(cardBox);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private ArrayList<Book> recentlyAdded() {
        ArrayList<Book> dsRecentlyAdded = new ArrayList<>();
        Book book = new Book();
        book.setName("CÂY CHUỐI NON ĐI\nGIÀY XANH");
        book.setAuthor("Nguyễn Nhật Ánh");
        book.setImageSrc("/img/caychuoinondigiayxanh.jpg");

        dsRecentlyAdded.add(book);

        book = new Book();
        book.setName("BẢY BƯỚC TỚI \nMÙA HÈ");
        book.setAuthor("Nguyễn Nhật Ánh");
        book.setImageSrc("/img/baybuoctoimuahe.jpg");

        dsRecentlyAdded.add(book);
        book = new Book();
        book.setName("NGỒI KHÓC TRÊN CÂY");
        book.setAuthor("Nguyễn Nhật Ánh");
        book.setImageSrc("/img/ngoikhoctrencay.jpg");

        dsRecentlyAdded.add(book);
        book = new Book();
        book.setName("NGÀY XƯA CÓ MỘT\nCHUYỆN TÌNH");
        book.setAuthor("Nguyễn Nhật Ánh");
        book.setImageSrc("/img/ngayxuacomotchuyentinh.jpg");

        dsRecentlyAdded.add(book);
        return dsRecentlyAdded;
    }
}
