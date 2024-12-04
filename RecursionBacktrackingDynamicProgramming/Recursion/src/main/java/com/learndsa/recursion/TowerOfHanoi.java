package com.learndsa.recursion;

public class TowerOfHanoi {
    public static void main(String[] args) {
        TowerOfHanoi tower = new TowerOfHanoi();
        tower.solve(64, 'A', 'B', 'C');
    }

    public void solve(int disk, char source, char middle, char destination) {
        if (disk == 0) {
            System.out.println("Plate" + disk + " from " + source + " to " + destination);
            return;
        }
        // we move n-1 plates to the middle rod - to be able to move the largest one
        // to the destination (last) rod
        solve(disk - 1, source, destination, middle);
        // we move the large plate to the destination
        // we call this method recursively so this is not always the largest plate
        System.out.println("Plate" + disk + " from " + source + " to " + destination);
        // we move n-1 plates from middle to the destination (with the help of the first rod)
        solve(disk - 1, middle, source, destination);
    }
}
