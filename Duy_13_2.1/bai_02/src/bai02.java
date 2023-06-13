import java.util.Scanner;

public class bai02 {
    public static void main(String[] args) {
        String chuoi, chuoi1;
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhap thong tin: ");
        chuoi=sc.nextLine();
        chuoi1=removeAccent(chuoi);
        System.out.println(chuoi1);

    }

    public static String removeAccent(String s) {
        String str="";
        char l;
        int j=0;
        char c[]=new char[100];
        for(int i=0;i<s.length();i++) {
            if(s.charAt(i)=='à'||s.charAt(i)=='á'||s.charAt(i)=='ả'||s.charAt(i)=='ã'||s.charAt(i)=='ạ'||
                    s.charAt(i)=='ă'||s.charAt(i)=='ắ'||s.charAt(i)=='ằ'||s.charAt(i)=='ẳ'||s.charAt(i)=='ẵ'||s.charAt(i)=='ặ'||
                    s.charAt(i)=='â'||s.charAt(i)=='ấ'||s.charAt(i)=='ầ'||s.charAt(i)=='ẩ'||s.charAt(i)=='ẫ'||s.charAt(i)=='ậ') {
                l=s.charAt(i);
                l='a';
                c[j]=l;
                j++;
            }else if(s.charAt(i)=='è'||s.charAt(i)=='é'||s.charAt(i)=='ẻ'||s.charAt(i)=='ẽ'||
                    s.charAt(i)=='ẹ'||s.charAt(i)=='ê'||s.charAt(i)=='ế'||s.charAt(i)=='ề'||
                    s.charAt(i)=='ể'||s.charAt(i)=='ễ'||s.charAt(i)=='ệ') {
                l=s.charAt(i);
                l='e';
                c[j]=l;
                j++;
            }else if(s.charAt(i)=='ì'||s.charAt(i)=='í'||s.charAt(i)=='ỉ'||s.charAt(i)=='ĩ'||s.charAt(i)=='ị') {
                l=s.charAt(i);
                l='i';
                c[j]=l;
                j++;
            }else if(s.charAt(i)=='ò'||s.charAt(i)=='ó'||s.charAt(i)=='ỏ'||s.charAt(i)=='õ'||s.charAt(i)=='ọ'||
                    s.charAt(i)=='ô'||s.charAt(i)=='ồ'||s.charAt(i)=='ố'||s.charAt(i)=='ổ'||s.charAt(i)=='ỗ'||s.charAt(i)=='ộ'||
                    s.charAt(i)=='ơ'||s.charAt(i)=='ờ'||s.charAt(i)=='ớ'||s.charAt(i)=='ở'||s.charAt(i)=='ỡ'||s.charAt(i)=='ợ') {
                l=s.charAt(i);
                l='o';
                c[j]=l;
                j++;
            }else if(s.charAt(i)=='ù'||s.charAt(i)=='ú'||s.charAt(i)=='ủ'||
                    s.charAt(i)=='ũ'||s.charAt(i)=='ụ'||s.charAt(i)=='ư'||s.charAt(i)=='ừ'||
                    s.charAt(i)=='ứ'||s.charAt(i)=='ử'||s.charAt(i)=='ữ'||s.charAt(i)=='ự') {
                l=s.charAt(i);
                l='u';
                c[j]=l;
                j++;
            }else if(s.charAt(i)=='ỳ'||s.charAt(i)=='ý'||s.charAt(i)=='ỷ'||s.charAt(i)=='ỹ'||s.charAt(i)=='ỵ') {
                l=s.charAt(i);
                l='y';
                c[j]=l;
                j++;
            }else if(s.charAt(i)=='đ') {
                l=s.charAt(i);
                l='d';
                c[j]=l;
                j++;
            }else {
                l=s.charAt(i);
                c[j]=l;
                j++;
            }
        }
        for(int i=0;i<s.length();i++) {
            str+=c[i];
        }

        return str;
    }
}
