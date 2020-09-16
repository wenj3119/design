package com.study.design.principle.liskovsutiution;

/**
 * @Author jainfo026
 * @Date 2020/9/15
 * @Description
 */
public class Square implements QuadRangle{
    private long length;

    public long getLength() {
        return length;
    }

    public void setLength(long length) {
        this.length = length;
    }

    @Override
    public long getHeight() {
        return length;
    }

    @Override
    public long getWidth() {
        return length;
    }
}
