package org.qtum.wallet.ui.fragment.qstore_by_type;

import org.qtum.wallet.model.gson.qstore.QSearchItem;

import java.util.List;

import rx.Observable;

/**
 * Created by drevnitskaya on 10.10.17.
 */

public interface QStoreByTypeInteractor {
    Observable<List<QSearchItem>> searchContractsObservable(int searchOffset, String mType, String tag, boolean byTag);
}
