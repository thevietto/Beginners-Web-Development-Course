
import java.util.List;

import com.google.common.base.Predicate;
import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;

/**
 * Created by ainurminibaev on 28.04.16.
 */
public class GuavaTestClass {


    public static void main(String[] args) {
        List<String> list = Lists.newArrayList("q2", "1");
        int i = Iterables.indexOf(list, new Predicate<String>() {
            @Override
            public boolean apply(String s) {
                return s.equals("q2");
            }
        });
        System.out.println(i);
    }
}
