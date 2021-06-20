public class Test09InvokeDirect {
    public static void main(String[] args) {
    Director director=()-> System.out.println("导演拍电影了...");
    invokeDirect(director);
    }
    private static void invokeDirect(Director director) {
        director.makeMovie();
    }
}
