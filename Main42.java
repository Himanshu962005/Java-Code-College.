class Student {
    int rollNumber;

    void getNumber(int n) {
        rollNumber = n;
    }

    void putNumber() {
        System.out.println("Roll Number = " + rollNumber);
    }
}

class Test extends Student {
    float part1, part2;

    void getMarks(float m1, float m2) {
        part1 = m1;
        part2 = m2;
    }

    void putMarks() {
        System.out.println("Marks Obtained");
        System.out.println("Part 1 = " + part1);
        System.out.println("Part 2 = " + part2);
    }
}

interface Sports {
    float sportWt = 6.0f;

    void putWt();
}

class Result extends Test implements Sports {
    float total;

    public void putWt() {
        System.out.println("Sports Wt = " + sportWt);
    }

    void display() {
        total = part1 + part2 + sportWt;
        putNumber();
        putMarks();
        putWt();
        System.out.println("Total Score = " + total);
    }
}

class Main42 // Hybrid.
{
    public static void main(String args[]) {
        Result student1 = new Result();
        student1.getNumber(1234);
        student1.getMarks(27.5f, 33.0f);
        student1.display();
    }
}