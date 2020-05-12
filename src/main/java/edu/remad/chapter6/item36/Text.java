package edu.remad.chapter6.item36;

import java.util.EnumSet;
import java.util.Set;

import static edu.remad.chapter6.item36.Text.Style.*;

public class Text {

    public enum Style {BOLD, ITALIC, UNDERLINE, STRIKETHROUGH}
    private Set<Style> styles;

    public void applyStyles(Set<Style> styles) {
        boolean isLeaveLoop = false;
        for (Style item : styles) {
            if(isLeaveLoop) {
                break;
            }

            switch (item) {
                case BOLD:
                case ITALIC:
                case UNDERLINE:
                case STRIKETHROUGH: {
                    this.styles = styles;
                    break;
                }
                default: {
                    isLeaveLoop = true;
                    break;
                }
            }
        }
    }

    public Set<Style> returnCheckedStylesSet() throws IllegalStateException {
        if(styles == null) {
            // Null for the set is an IllegalState.
            throw new IllegalStateException();
        }
        return styles;
    }

    public static void main(String[] args) {
        Text text = new Text();
        text.applyStyles(EnumSet.of(BOLD, ITALIC));

        System.out.println("EnumSet contains: ");
        for(Style type : text.returnCheckedStylesSet()) {
            System.out.println(type);
        }
    }
}
