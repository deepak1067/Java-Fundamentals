package com.knoldus.max_occurrence;

class ValueCount implements Comparable<ValueCount>{
    int value;
    int count;

    public ValueCount(int value, final int count) {
        super();
        this.value = value;
        this.count = count;
    }

    public ValueCount incrementCount() {
        ++count;return this;}

    public int getValue() {return value;}

    public void setValue(int value) {this.value = value;}

    public int getCount() {return count;}

    public void setCount(int count) {this.count = count;}

    @Override
    public int compareTo(ValueCount arg0) {
        return arg0.getCount() - this.getCount();
    }

    @Override
    public String toString() {
        return "ValueCount [value=" + value + ", count=" + count + "]";
    }

}
