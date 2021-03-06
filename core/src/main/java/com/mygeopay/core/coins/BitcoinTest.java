package com.mygeopay.core.coins;

import com.mygeopay.core.coins.families.BitFamily;

/**
 * @author John L. Jegutanis
 */
public class BitcoinTest extends CoinType {
    private BitcoinTest() {
        id = "bitcoin.test";

        addressHeader = 111; // public key address
        p2shHeader = 196;   // script address
        acceptableAddressCodes = new int[] { addressHeader, p2shHeader };
        spendableCoinbaseDepth = 100;
        dumpedPrivateKeyHeader = 239;

        family = BitFamily.get();
        name = "BTCτ";
        fullname ="BTC Testnet";
        symbol = "BTCt";
        uriScheme = "bitcoin";
        bip44Index = 1;
        unitExponent = 8;
        feePerKb = value(10000);
        minNonDust = value(5460);
        softDustLimit = value(1000000); // 0.01 BTC
        softDustPolicy = SoftDustPolicy.AT_LEAST_BASE_FEE_IF_SOFT_DUST_TXO_PRESENT;
    }

    private static BitcoinTest instance = new BitcoinTest();
    public static synchronized BitcoinTest get() {
        return instance;
    }
}
