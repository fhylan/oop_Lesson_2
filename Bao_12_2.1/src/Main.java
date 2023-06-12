import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String s = "xin chào các bạn";
        System.out.println("Văn bản nhập vào: " + s);
        String unsignedString;
        unsignedString = removeAccent(s);
        System.out.println("Đoạn văn bản sau khi bỏ dấu: " + unsignedString);
    }

    public static String removeAccent(String s)
    {
        StringBuilder str = new StringBuilder();
        String pos = "ÀÁĂÂÃĐÈÉÊÌÍÒÓÔƠÕÙỦÚÝàáăâãđèéêìíịòóôơõùủúýỲỳỴỵỶỷỸỹ";
        String unsignedChars = "AAAADEEEIIOOOOOUUUYaaaaadeeeiiiooooouuuyYyYyYyYy";
        for (int i = 0; i < s.length(); i++)
        {
            char c = s.charAt(i);
            if (c >= 0x00C0 && c <= 0x1EF9) // kiểm tra kí tự có phải thuộc bảng mã kí tự có dấu.
            {
                for (int j = 0; j < pos.length(); j++)
                {
                    if (c == pos.charAt(j))
                    {
                        c = unsignedChars.charAt(j);
                    }
                }
            }
            str.append(c);
        }
        return str.toString();
    }
}

//remove Diacritics : chuyển đổi dấu kí tự.