import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import javax.swing.*;
/**import net.proteanit.sql.DbUtils;
**/

public class Main {
    public static void main(String[] args)
    {
        login();
    }

    public static void login()
    {
        JFrame f = new JFrame("Login");
        JLabel l1,l2;
        l1 = new JLabel("Username");
        l1.setBounds(30,15, 100,30);
        l2=new JLabel("Password");
        l2.setBounds(30,50, 100,30);
    }
}