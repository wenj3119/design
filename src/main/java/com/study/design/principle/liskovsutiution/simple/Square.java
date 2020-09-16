package com.study.design.principle.liskovsutiution.simple;

/**
 * @Author jainfo026
 * @Date 2020/9/15
 * @Description
 */
public class Square extends Rectangle{
    private long length;

    public long getLength() {
        return length;
    }

    public void setLength(long length) {
        this.length = length;
    }

    @Override
    public long getHeight() {
        return getHeight();
    }

    @Override
    public void setHeight(long height) {
        setHeight(height);
    }

    @Override
    public long getWidth() {
        return getWidth();
    }

    @Override
    public void setWidth(long width) {
        setWidth(width);
    }
}
