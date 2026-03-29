package service;

import model.document;
import database.DBconnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class verificationService {

    public static void verify(document doc) {
        try {
            Connection con = DBconnection.getConnection();
            String query = "SELECT * FROM documents WHERE doc_id=?";
            PreparedStatement ps = con.prepareStatement(query);
            ps.setString(1, doc.getDocId());

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                System.out.println("⚠️ Duplicate Document Found!");
            } else {
                String insert = "INSERT INTO documents VALUES (?, ?, ?)";
                PreparedStatement ps2 = con.prepareStatement(insert);
                ps2.setString(1, doc.getDocId());
                ps2.setString(2, doc.getName());
                ps2.setString(3, doc.getType());
                ps2.executeUpdate();

                System.out.println("✅ Document Verified & Stored");
            }

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
