package com.hannesdorfmann.mosby.mvp.viewstate.lce;

/**
 * This kind of {@link LceViewState} can be used with <b></b>Fragments that have set
 * setRetainInstance(true); <b/>, because that allows to store / restore any kind of data along
 * orientation changes. So this ViewState will not be saved into the Bundle of saveInstanceState().
 * This ViewState will be stored and restored directly by the Fragment itself by setting
 * Fragment.setRetainInstance(true);
 *
 * <p>
 * Can be used for <b>Fragments only</b>.
 * </p>
 *
 * @author Hannes Dorfmann
 * @since 1.0.0
 */
public class RetainingFragmentLceViewState<D> extends AbsLceViewState<D> {


}
