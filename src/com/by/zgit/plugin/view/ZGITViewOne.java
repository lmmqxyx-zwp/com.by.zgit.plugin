package com.by.zgit.plugin.view;

import org.eclipse.swt.widgets.List;

import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.help.IWorkbenchHelpSystem;
import org.eclipse.ui.part.ViewPart;

/**
 * 视图 『一』
 * 
 * @author zwp
 *
 */
public class ZGITViewOne extends ViewPart {

    private List list; // 将列表写成类的实例变量，以扩大它的可访问范围

    @Override
    public void createPartControl(Composite composite) {
        // TODO Auto-generated method stub
        IWorkbenchHelpSystem help = PlatformUI.getWorkbench().getHelpSystem();
        help.setHelp(composite, "cn.com.kxh.myplugin.buttonHelpId");
        Composite topComp = new Composite(composite, SWT.NONE);
        topComp.setLayout(new FillLayout());
        list = new List(topComp, SWT.BORDER);
        list.add("中国");
        list.add("美国");
        list.add("法国");
    }

    @Override
    public void setFocus() {
        // TODO Auto-generated method stub

    }

}
