package com.by.zgit.plugin.view;

import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.part.ViewPart;

/**
 * 视图 『二』
 * 
 * @author zwp
 *
 */
public class ZGITViewTwo extends ViewPart {

    @Override
    public void createPartControl(Composite composite) {
        // TODO Auto-generated method stub
        Composite topComp = new Composite(composite, SWT.NONE);
        topComp.setLayout(new FillLayout());
        Text text = new Text(topComp, SWT.BORDER);
        text.setText("我是Text框");
    }

    @Override
    public void setFocus() {
        // TODO Auto-generated method stub

    }

}
