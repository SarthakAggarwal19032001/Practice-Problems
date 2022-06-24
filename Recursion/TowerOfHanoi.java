public class TowerOfHanoi {
    /*Constraints
    1.Only one disk may be moved at a time
    2.Each move consists of taking the upper disk from one of the stacks and placing it on top of another stack or on an empty rod.
    3.No. disks may be placed on top of a disk that is smaller than it.
    */
    static void towerofhanoi(int n, char from_rod, char to_rod, char aux_rod){
        if(n==0){
            return;
        }
        towerofhanoi(n-1, from_rod, aux_rod, to_rod);
        System.out.println("Move disk "+n+" from rod "+from_rod+" to rod "+to_rod);
        towerofhanoi(n-1, aux_rod, to_rod, from_rod);
    }

    public static void main(String[] args) {
        int n=3;
        towerofhanoi(n, 'A', 'C', 'B');
    }
}
