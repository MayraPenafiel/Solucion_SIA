package com.example.subastainversaapp.adaptadorList;

public class MultipleData {
    private String text;
    private boolean selected;

    public MultipleData(String text, boolean selected) {
        this.text = text;
        this.selected = selected;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public boolean isSelected() {
        return selected;
    }

    public void setSelected(boolean selected) {
        this.selected = selected;
    }
}
