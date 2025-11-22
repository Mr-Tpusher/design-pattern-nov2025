package com.tpusher.creational.builder;

public class SubwaySandwich {
    private String bread;
    private String salad;
    private String sauce;

    public SubwaySandwich(Builder builder) {
        this.bread = builder.bread;
        this.salad = builder.salad;
        this.sauce = builder.sauce;
    }

    @Override
    public String toString() {
        return "SubwaySandwich{" +
                "bread='" + bread + '\'' +
                ", salad='" + salad + '\'' +
                ", sauce='" + sauce + '\'' +
                '}';
    }

    public static class Builder {
        private String bread;
        private String salad;
        private String sauce;

        public Builder setBread(String bread) {
            this.bread = bread;
            return this;
        }

        public Builder setSalad(String salad) {
            this.salad = salad;
            return this;
        }

        public Builder setSauce(String sauce) {
            this.sauce = sauce;
            return this;
        }

        public SubwaySandwich build() {
            return new SubwaySandwich(this);
        }
    }
}
