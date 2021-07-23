package org.incorp.i;

public class Robot  implements JumRun{
    private String name;
    private int maxJump;
    private int maxRun;

    public Robot(String name, int maxJump, int maxRun) {
        this.name = name;
        this.maxJump = maxJump;
        this.maxRun = maxRun;
    }

    @Override
    public void jump(int up) {
        JumRun.super.jump(up);
    }

    @Override
    public void run(int distans) {
        System.out.println(name + " run " + distans + " meters");
    }
}

