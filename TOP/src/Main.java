import java.io.*;
import java.util.*;

class Main {
    static Scanner sc;
    // N - Number of vertices, P - Number of paths, Tmax - available time budget per path
    static int N, P;
    static double Tmax;
    // The first point is the starting point. The last point is the ending point. The Euclidian distance is used.
    static Vertex[] vertices;

    public static void input(){
        sc.next();
        N = sc.nextInt();
        sc.next();
        P = sc.nextInt();
        sc.next();
        Tmax = sc.nextDouble();
        vertices = new Vertex[N];
        for (int i = 0; i < N; i++){
            double x = sc.nextDouble();
            double y = sc.nextDouble();
            int S = sc.nextInt();
            vertices[i] = new Vertex(x, y, S);
        }
    }

    public static void solve(){
        // Your beautiful solution here...
    }

    public static void main(String args[]) throws FileNotFoundException{
        String input_file = args[0];
        sc = new Scanner(new File(input_file));
        input();
        sc.close();
        solve();
    }
}

class Vertex {
    public double x, y;
    public int score;
    // Calculate euclidian_distance between this and dest
    public double euclidian_distance(Vertex dest){
        return Math.sqrt(Math.pow((this.x - dest.x), 2) + Math.pow((this.y - dest.y), 2));
    }
    public Vertex(double x, double y, int S){
        this.x = x;
        this.y = y;
        this.score = S;
    }
}