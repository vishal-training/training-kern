public class ServerLoad {
    public static void main(String[] args) {
        int[] load = {65, 70, 55, 80, 60, 75, 68};
        int max = load[0], min = load[0], sum = 0;
        for (int l : load) {
            if (l > max) max = l;
            if (l < min) min = l;
            sum += l;
        }
        System.out.println(max);
        System.out.println(min);
        System.out.println(sum / load.length);
    }
}
