package jp.ac.tsukuba.cs.mdl.dnn4j.layers;

import jp.ac.tsukuba.cs.mdl.numj.core.NumJ;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class PoolingTest {

    private Pooling pool;

    @Before
    public void init() {
        pool = new Pooling(3, 3, 1, 0);
    }

//    @Test
    public void forwardTest() {
        Assert.assertEquals(NumJ.create(new double[]{
                10., 11.,
                14., 15.,

                26., 27.,
                30., 31.,

                42., 43.,
                46., 47.,

                58., 59.,
                62., 63.,

                74., 75.,
                78., 79.,

                90., 91.,
                94., 95.,

                106., 107.,
                110., 111.,

                122., 123.,
                126., 127.,

                138., 139.,
                142., 143.,


                154., 155.,
                158., 159.,

                170., 171.,
                174., 175.,

                186., 187.,
                190., 191.,

                202., 203.,
                206., 207.,

                218., 219.,
                222., 223.,

                234., 235.,
                238., 239.,

                250., 251.,
                254., 255.,

                266., 267.,
                270., 271.,

                282., 283.,
                286., 287.
        }, 2, 9, 2, 2), pool.forward(NumJ.arange(2, 9, 4, 4)));


    }

//    @Test
    public void backward(){
        pool.forward(NumJ.arange(2, 9, 4, 4));
        Assert.assertEquals(
                NumJ.create(new double[]{
                        0., 0., 0., 0.,
                        0., 0., 0., 0.,
                        0., 0., 0., 1.,
                        0., 0., 2., 3.,

                        0., 0., 0., 0.,
                        0., 0., 0., 0.,
                        0., 0., 4., 5.,
                        0., 0., 6., 7.,

                        0., 0., 0., 0.,
                        0., 0., 0., 0.,
                        0., 0., 8., 9.,
                        0., 0., 10., 11.,

                        0., 0., 0., 0.,
                        0., 0., 0., 0.,
                        0., 0., 12., 13.,
                        0., 0., 14., 15.,

                        0., 0., 0., 0.,
                        0., 0., 0., 0.,
                        0., 0., 16., 17.,
                        0., 0., 18., 19.,

                        0., 0., 0., 0.,
                        0., 0., 0., 0.,
                        0., 0., 20., 21.,
                        0., 0., 22., 23.,

                        0., 0., 0., 0.,
                        0., 0., 0., 0.,
                        0., 0., 24., 25.,
                        0., 0., 26., 27.,

                        0., 0., 0., 0.,
                        0., 0., 0., 0.,
                        0., 0., 28., 29.,
                        0., 0., 30., 31.,

                        0., 0., 0., 0.,
                        0., 0., 0., 0.,
                        0., 0., 32., 33.,
                        0., 0., 34., 35.,


                        0., 0., 0., 0.,
                        0., 0., 0., 0.,
                        0., 0., 36., 37.,
                        0., 0., 38., 39.,

                        0., 0., 0., 0.,
                        0., 0., 0., 0.,
                        0., 0., 40., 41.,
                        0., 0., 42., 43.,

                        0., 0., 0., 0.,
                        0., 0., 0., 0.,
                        0., 0., 44., 45.,
                        0., 0., 46., 47.,

                        0., 0., 0., 0.,
                        0., 0., 0., 0.,
                        0., 0., 48., 49.,
                        0., 0., 50., 51.,

                        0., 0., 0., 0.,
                        0., 0., 0., 0.,
                        0., 0., 52., 53.,
                        0., 0., 54., 55.,

                        0., 0., 0., 0.,
                        0., 0., 0., 0.,
                        0., 0., 56., 57.,
                        0., 0., 58., 59.,

                        0., 0., 0., 0.,
                        0., 0., 0., 0.,
                        0., 0., 60., 61.,
                        0., 0., 62., 63.,

                        0., 0., 0., 0.,
                        0., 0., 0., 0.,
                        0., 0., 64., 65.,
                        0., 0., 66., 67.,

                        0., 0., 0., 0.,
                        0., 0., 0., 0.,
                        0., 0., 68., 69.,
                        0., 0., 70., 71.
                }, 2, 9, 4, 4), pool.backward(NumJ.arange(2, 9, 2, 2))
        );
    }
}