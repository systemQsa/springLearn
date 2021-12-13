package ua.lambda.refsToMethods;

public class Test5 {
    public static void main(String[] args) {
        /*
        при вызове м()
        первый параметр будет выступать тем обьектом на которм быдет вызван метод(напримет charAt in String)
        и куда будут переданы все последующие аргументы
         */
      G g = String::charAt;
        System.out.println(g.m("asdf", 3));

        G g1 = new G() {
            @Override
            public char m(String s, int x) {
                return s.charAt(x); // за кадром происходит
            }
        };
    }
    interface G{
        char m(String s,int x);
    }

}
