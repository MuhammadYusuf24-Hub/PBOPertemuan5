/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exception;

/**
 *
 * @author LENOVO
 */
class TiketTidakValidException extends Exception {

    public TiketTidakValidException(String t) {
        super(t);
    }
}

public class Tiket {

    public static void cektiket(String kodeTiket)
            throws TiketTidakValidException {

        if (!kodeTiket.equals("TIKET-001") && !kodeTiket.equals("TIKET-002")) {
            throw new TiketTidakValidException("Tiket " + kodeTiket + " tidak valid atau palsu!");
        }
        System.out.println("Tiket valid: " + kodeTiket);
    }

    public static void main(String[] args) {
        try {
            cektiket("TIKET-001"); // ini tiket valid
        } catch (TiketTidakValidException e) {
            System.out.println("Exception tertangkap: " + e.getMessage());
        }

        try {
            cektiket("TIKET-007"); // ini tiket palsu
        } catch (TiketTidakValidException e) {
            System.out.println("Exception tertangkap: " + e.getMessage());
        }
    }
}
