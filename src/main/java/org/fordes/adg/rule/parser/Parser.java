package org.fordes.adg.rule.parser;

import org.fordes.adg.rule.enums.Function;
import org.fordes.adg.rule.model.Rule;

import java.util.function.Supplier;

public abstract class Parser implements Supplier<Rule> {

    protected Rule rule;

    protected final String content;

    public Parser(String content) {
        this.content = content;
        rule = new Rule(content);
        rule.setFunction(content.startsWith("@@")? Function.ALLOW: Function.BLOCK);
    }

    public static Parser getParser(String content) {
        if (content.contains("/")) {
            return new PathParser(content);
        } else if (content.contains("##")) {
            return new ElementParser(content);
        } else {
            return new DomainParser(content);
        }
    }
}
