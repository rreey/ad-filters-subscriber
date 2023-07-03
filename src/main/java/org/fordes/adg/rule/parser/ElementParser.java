package org.fordes.adg.rule.parser;

import lombok.extern.slf4j.Slf4j;
import org.fordes.adg.rule.model.Rule;

/**
 * @author fordes123 on 2023/4/14
 */
@Slf4j
public class ElementParser extends Parser {

    public ElementParser(String content) {
        super(content);
    }

    @Override
    public Rule get() {
        log.info("元素规则: {}", content);
        return null;
    }

}