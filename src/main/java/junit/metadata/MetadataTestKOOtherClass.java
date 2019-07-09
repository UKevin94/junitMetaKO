package junit.metadata;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.squashtest.ta.galaxia.squash.tf.galaxia.annotations.TFMetadata;

public class MetadataTestKOOtherClass {

    @Test
    @TFMetadata( key = "unicity", value = "bla")
    public void unicityErrorOtherFile(){
        int a = 2;
        int b = 2;
        Assertions.assertEquals(a, b);
    }
}
