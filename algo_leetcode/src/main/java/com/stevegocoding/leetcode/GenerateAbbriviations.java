package com.stevegocoding.leetcode;

import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by magkbdev on 6/25/16.
 */
public class GenerateAbbriviations {

    private Logger logger = LoggerFactory.getLogger(GenerateAbbriviations.class);

    public List<String> generateAbbrivations(String s) {
        List<String> res = new ArrayList<>();
        helper(s, 0, "", res);
        return res;
    }

    private void helper(String s, int start, String cur, List<String> res) {
        logger.debug("============================ level start ==================================");
        logger.debug("start -- " + start);
        logger.debug("cur -- " + cur);
        logger.debug("result in this level -- " + cur + s.substring(start));

        res.add(cur + s.substring(start));

        if (start == s.length()) {
            return;
        }

        int i = 0;
        if (start > 0) {
            i = start + 1;
        }

        for (; i < s.length(); ++i) {
            String prefix = cur + s.substring(start, i);
            logger.debug("i -- " + i);
            logger.debug("prefix -- " + prefix);
            for (int j = 1; j <= s.length() - i; ++j) {
                logger.debug("j  -- " + j);
                helper(s, i + j, prefix + j, res);
            }
        }
    }
}
