/*168. Excel Sheet Column Title
https://leetcode.com/problems/excel-sheet-column-title/*/
package Math;

public class ExcelSheetColumnTitle {
    public static void main(String[] args) {
        int input = 7001;
        System.out.println(convertToTitle(input));
    }

    static String convertToTitle(int columnNumber){
        StringBuilder sb = new StringBuilder();
        while(columnNumber>0){
            columnNumber--;
            sb.append((char) ((columnNumber) %26 + 'A'));
            columnNumber = columnNumber/26;
        }
        return sb.reverse().toString();
    }


}

/* static String convertToTitle(int columnNumber) {
        StringBuilder sb = new StringBuilder();
        while (columnNumber > 0) {
            columnNumber--;
            sb.append((char) ((columnNumber) % 26 + 'A'));
            columnNumber = columnNumber / 26;
        }
        return sb.reverse().toString();
    }*/