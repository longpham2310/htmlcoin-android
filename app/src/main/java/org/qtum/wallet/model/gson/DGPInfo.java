package org.qtum.wallet.model.gson;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by max-v on 10/4/2017.
 */

public class DGPInfo {

    @SerializedName("maxblocksize")
    @Expose
    private Integer maxblocksize;
    @SerializedName("blockgaslimit")
    @Expose
    private Integer blockgaslimit;
    @SerializedName("mingasprice")
    @Expose
    private Integer mingasprice;

    public Integer getMaxblocksize() {
        return maxblocksize;
    }

    public Integer getBlockgaslimit() {
        return blockgaslimit;
    }

    public Integer getMingasprice() {
        return mingasprice;
    }
}
