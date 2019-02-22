package leetcode1to15;

public class RomanToIntSolution {
    public int romanToInt(String s) {
        int num=0;
        String[] m = new String[]{"M","MM","MMM"};
        String[] c = new String[]{"C", "CC","CCC","CD","D","DC","DCC","DCCC","CM"};
        String[] l = new String[]{"X","XX","XXX","XL","L","LX","LXX","LXXX","XC"};
        String[] i = new String[]{"I","II","III","IV","V","VI","VII","VIII","IX"};
        while(s!=null&& !s.equals("")){
            for(int index = m.length-1;index>=0;index--){
                if(s.startsWith(m[index])){
                    s = s.substring(m[index].length());
                    num += (index+1)*1000;
                }
            }
            for(int index = c.length-1;index>=0;index--){
                if(s.startsWith(c[index])){
                    s = s.substring(c[index].length());
                    num  += (index+1)*100;
                }
            }
            for(int index = l.length-1;index>=0;index--){
                if(s.startsWith(l[index])){
                    s = s.substring(l[index].length());
                    num  += (index+1)*10;
                }
            }
            for(int index = i.length-1;index>=0;index--){
                if(s.startsWith(i[index])){
                    s = s.substring(i[index].length());
                    num  += (index+1);
                }
            }

        }
        return num;
    }

    public static void main(String[] args){
        System.out.println(new RomanToIntSolution().romanToInt("MCMXCIV"));
    }
}