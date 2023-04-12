package Controller.Helper;

import Model.User;

import javax.swing.*;
import java.awt.*;

public class UserStoryListRenderer extends DefaultListCellRenderer  {
    public Component getListCellRendererComponent(JList<?> list,
                                                  Object value,
                                                  int index,
                                                  boolean isSelected,
                                                  boolean cellHasFocus) {
        JLabel label = (JLabel) super.getListCellRendererComponent(list, value, index, isSelected, cellHasFocus);
        if (value instanceof User) {
            User user = (User) value;
            label.setText(user.getName());
        }
        return label;
    }
}
