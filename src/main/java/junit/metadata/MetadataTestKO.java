package junit.metadata;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.squashtest.ta.galaxia.squash.tf.galaxia.annotations.TFMetadata;
import org.squashtest.ta.galaxia.squash.tf.galaxia.annotations.TFMetadataList;

public class MetadataTestKO {

    @Test
    @TFMetadata( key = "éàùôöîïèë", value = {"éééàùôöîïè"})
    @TFMetadata( key = "àààéàùôöîïè")
    @TFMetadata( key = "ùùùùéàùôöîïè", value = {"ùùone", "ééétwo", "ààààthree"})
    public void accent (){
        int a = 2;
        int b = 2;
        Assertions.assertEquals(a, b);
    }

    @Test
    @TFMetadata( key = "first_K-E.Y&~#{}=+°|$£¤*%§!?;", value = {"vv&~#{}=+°|$£¤*%§!?;"})
    @TFMetadata( key = "22&~#{}=+°|$£¤*%§!?;")
    @TFMetadata( key = "multi&~#{}=+°|$£¤*%§!?;", value = {"first&~#{}=+°|$£¤*%§!?;", "second&~#{}=+°|$£¤*%§!?;", "third&~#{}=+°|$£¤*%§!?;"})
    public void specialChar (){
        int a = 2;
        int b = 2;
        Assertions.assertEquals(a, b);
    }

    @Test
    @TFMetadata( key = "first_K-E.Y", value = "")
    @TFMetadata( key = "mu.l-ti_Key", value = {"first","two", ""})
    public void noValue (){
        int a = 2;
        int b = 2;
        Assertions.assertEquals(a, b);
    }

    @Test
    @TFMetadata( key = "same", value = "other")
    @TFMetadata( key = "same", value = {"first","two"})
    public void sameKeyMultipleAnnot (){
        int a = 2;
        int b = 2;
        Assertions.assertEquals(a, b);
    }

    @Test
    @TFMetadata( key = "unicity", value = "bla")
    public void unicityError1(){
        int a = 2;
        int b = 2;
        Assertions.assertEquals(a, b);
    }

    @Test
    @TFMetadata( key = "unicity", value = "bla")
    public void unicityError2(){
        int a = 2;
        int b = 2;
        Assertions.assertEquals(a, b);
    }

    @Test
    @TFMetadata( key = "unicity_multiline", value = "same")
    public void unicityErrorMultiline1(){
        int a = 2;
        int b = 2;
        Assertions.assertEquals(a, b);
    }

    @Test
    @TFMetadata( key = "unicity_multiline", value = {"different", "same", "another"})
    public void unicityErrorMultiline2(){
        int a = 2;
        int b = 2;
        Assertions.assertEquals(a, b);
    }
}
