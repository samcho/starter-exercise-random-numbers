import java.util.Random;

public class Random_Numbers {
    public static void main(String[] args) {
        Random r = new Random();
        System.out.println("Number: " + Math.abs(r.nextInt()));
    }
}

/*
For Windows users, you must first install WSL in administrator PowerShell: wsl --install
For Mac users, everything just works in the Terminal Window.
 */

/*
for ((i = 0; i < 100; i++))
do java -cp out/production/starter-exercise-random-numbers Random_Numbers
done > rand_num.dat
 */

/*
for i in CAT_00/*
do
find $i
done > files.dat
 */

/*
 awk '{ s+=$2 } END { printf("%d", s) }' rand_num.dat
 */