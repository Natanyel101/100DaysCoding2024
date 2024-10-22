package isc;
import java.util.*;
public class day51 {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("||ROAD MAP 100 DAYS CODING||");
        System.out.println("masukkan day ke berapa yang ingin anda lihat.!!!");
        System.out.print("day ke: ");
       int oke = in.nextInt();
        System.out.println("commitan day ke: "+oke+" adalah");
        switch (oke) {
            case 1:
            System.out.println("membuat project dan class");
            break;
            case 2:
            System.out.println("method main");
            break;
            case 3:
            System.out.println("System.out.println");
            break;
            case 4:
            System.out.println("System.out.print dan system.out.printf");
            break;
            case 5:
            System.out.println("komentar");
            break;
            case 6:
            System.out.println("variable: deklarasi");
            break;
            case 7:
            System.out.println("deklarasi: inisialisasi");
            break;
            case 8:
            System.out.println("variable: update");
            break;
            case 9:
            System.out.println("variable: constanta");
            break;
            case 10:
            System.out.println("type data: byte");
            break;
            case 11:
            System.out.println("type data:  short");
            break;
            case 12:
            System.out.println("type data: int");
            break;
            case 13:
            System.out.println("evaluasi mentor");
            break;
            case 14:
            System.out.println("type data: long");
            break;
            case 15:
            System.out.println("type data: double");
            break;
            case 16:
            System.out.println("type data: float");
            break;
            case 17:
            System.out.println("type data: char");
            break;
            case 18:
            System.out.println("type data: boolean");
            break;
            case 19:
            System.out.println("reference: string");
            break;
            case 20:
            System.out.println("reference: byte");
            break;
            case 21:
            System.out.println("reference: short");
            break;
            case 22:
            System.out.println("reference: integer");
            break;
            case 23:
            System.out.println("reference: long");
            break;
            case 24:
            System.out.println("reference: float");
            break;
            case 25:
            System.out.println("reference: double");
            break;
            case 26:
            System.out.println("reference:  char");
            break;
            case 27:
            System.out.println("evaluasi (ICL)");
            break;
            case 28:
            System.out.println("reference: boolean");
            break;
            case 29:
            System.out.println("reference: BigInteger");
            break;
            case 30:
            System.out.println("reference: BigDecimal");
            break;
            case 31 :
            System.out.println("konversi string ke tipe data primitif");
            break;
            case 32:
            System.out.println("konversi primitif ke string");
            break;
            case 33:
            System.out.println("casting");
            break;
            case 34:
            System.out.println("imput dari keyboard");
            break;
            case 35:
            System.out.println("operator aritmatika: penjumlaha dan pengurangan");
            break;
            case 36 :
            System.out.println("perkalian, pengurangan serta modulo");
            break;
            case 37:
            System.out.println("oprator penugasan: pengisian nilai,pengisian dan penambahan,pengisian dan pengurangan");
            break;
            case 38:
            System.out.println("pengisian dan perkalian, pengisian dan pembagian");
            break;
            case 39 :
            System.out.println("pengisian dan modulo");
            break;
            case 40:
            System.out.println("operator perbandingan: lebih besar dan lebih kecil");
            break;
            case 41:
            System.out.println("EVALUASI MENTOR");
            break;
            case 42 :
            System.out.println("sama dengan dan tidak sama dengan");
            break;
            case 43 :
            System.out.println("lebih besar sama dengan dan lebih kecil sama dengan");
            break;
            case 44:
            System.out.println("operator logika: AND");
            break;
            case 45:
            System.out.println("OR");
            break;
            case 46 :
            System.out.println("negasi/kebalikan");
            break;
            case 47:
            System.out.println("percabangan: if");
            break;
            case 48 :
            System.out.println("percabangan: if-else");
            break;
            case 49:
            System.out.println("percabangan: if-else if");
            break;
            case 50:
            System.out.println("percabangan: if-else if-else");
            break;
            case 51:
            System.out.println("percabangan: switch case");
            break;
            case 52:
            System.out.println("ternary");
            break;
            case 53 :
            System.out.println("looping: for");
            break;
            case 54:
            System.out.println("looping: increnent");
            break;
            case 55:
            System.out.println("EVALUASI BESAR");
            break;
            case 56:
            System.out.println("looping: decrement");
            break;
            case 57:
            System.out.println("looping: while increment");
            break;
            case 58:
            System.out.println("looping: while decrement");
            break;
            case 59:
            System.out.println("looping: for each");
            break;
            case 60:
            System.out.println("looping: do while");
            break;
            case 61:
            System.out.println("infinite loop");
            break;
            case 62:
            System.out.println("keyword: break");
            break;
            case 63:
            System.out.println("keyword: continue");
            break;
            case 64:
            System.out.println("break label");
            break;
            case 65:
            System.out.println("nested loop");
            break;
            case 66:
            System.out.println("pola persegi dan peprsegi panjang");
            break;
            case 67:
            System.out.println("method void");
            break;
            case 68:
            System.out.println("method non-void");
            break;
            case 69:
            System.out.println("EVALUASI MENTOR");
            break;
            case 70:
            System.out.println("Method parameter");
            break;
            case 71:
            System.out.println("Method Static");
            break;
            case 72:
            System.out.println("Method rekursif");
            break;
            case 73:
            System.out.println("String Method: charAt()");
            break;
            case 74:
            System.out.println("String Method: length()");
            break;
            case 75:
            System.out.println("String Method: tolowerCase()");
            break;
            case 76:
            System.out.println("String Method: toUpperCase()");
            break;
            case 77:
            System.out.println("String Method: equals");
            break;
            case 78:
            System.out.println("String Method: equalsIgnoreCase()");
            break;
            case 79:
            System.out.println("String Method: toString");
            break;
            case 80 :
            System.out.println("String Method: trim()");
            break;
            case 81:
            System.out.println("String Method: valueOf()");
            break;
            case 82:
            System.out.println("method ceil(),floor(), dan round()");
            break;
            case 83:
            System.out.println("EVALUASI BESAR");
            break;
            case 84:
            System.out.println("membuat objek Array satu dimensi ");
            break;
            case 85:
            System.out.println("mengisi elemen ke Array satu dimensi pada saan di inisialisasi");
            break;
            case 86:
            System.out.println("mencetak elemen pada Array satu dimensi");
            break;
            case 87:
            System.out.println("mengubah nilai Array satu dimensi pada index tertentu");
            break;
            case 88:
            System.out.println("soal");
            break;
            case 89:
            System.out.println("soal");
            break;
            case 90:
            System.out.println("soal");
            break;
            case 91:
            System.out.println("soal percabangan: you and I, end");
            break;
            case 92:
            System.out.println("Asterisck pattern: pola V");
            break;
            case 93:
            System.out.println("Asterisck pattern: pola V terbalik");
            break;
            case 94:
            System.out.println("Asterisck pattern: segitiga");
            break;
            case 95:
            System.out.println("Asterisck pattern: segitiga siku dan sebaliknya");
            break;
            case 96:
            System.out.println("Asterisck pattern: diamond");
            break;
            case 97:
            System.out.println("soal: mencetak biangan prima dari 1-n");
            break;
            case 98:
            System.out.println("soal: total penjumlahan bilangan genap dari x ke z");
            break;
            case 99:
            System.out.println("soal: kalkulator sederhana");
            break;
            case 100:
            System.out.println("EVALUASI");
            break;
            default:
            System.out.println("INVAILID");
            break;
        }
    }
}
