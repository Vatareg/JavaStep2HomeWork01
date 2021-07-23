package org.incorp.i;

public class Cat  implements JumRun{
    private String name;
    private int maxJump;
    private int maxRun;

    public Cat(String name, int maxJump, int maxRun) {
        this.name = name;
        this.maxJump = maxJump;
        this.maxRun = maxRun;
    }

    @Override
    public void jump(int up) {
        System.out.println("Cat Jump" + up);
    }

    @Override
    public void run(int distans) {
        System.out.println(name + " run " + distans + " meters");

    }
}
