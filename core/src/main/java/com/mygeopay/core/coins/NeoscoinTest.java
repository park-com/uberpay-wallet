package com.mygeopay.core.coins;

import com.mygeopay.core.coins.families.BitFamily;

/**
 * @author John L. Jegutanis
 */
public class NeoscoinTest extends CoinType {
    private NeoscoinTest() {
        id = "neoscoin.test";

        addressHeader = 63;
        p2shHeader = 188;
        acceptableAddressCodes = new int[] { addressHeader, p2shHeader };
        spendableCoinbaseDepth = 100;
        dumpedPrivateKeyHeader = 239;

        family = BitFamily.get();
        name = "NEOS Testnet";
        symbol = "NEOSt";
        uriScheme = "neoscoin";
        bip44Index = 1;
        unitExponent = 8;
        feePerKb = value(10000);
        minNonDust = value(5460);
        softDustLimit = value(1000000); // 0.01 NEOS
        softDustPolicy = SoftDustPolicy.AT_LEAST_BASE_FEE_IF_SOFT_DUST_TXO_PRESENT;
    }

    private static NeoscoinTest instance = new NeoscoinTest();
    public static synchronized NeoscoinTest get() {
        return instance;
    }
}