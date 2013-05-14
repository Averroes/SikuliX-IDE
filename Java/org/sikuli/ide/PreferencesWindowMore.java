/*
 * Copyright 2010-2013, Sikuli.org
 * Released under the MIT License.
 *
 * added RaiMan 2013
 */
package org.sikuli.ide;

import javax.swing.JCheckBox;

/**
 *
 * @author rhocke
 */
public class PreferencesWindowMore extends javax.swing.JPanel {

  /**
   * Creates new form NewPref
   */

	private PreferencesUser prefs;
	private boolean DEBUG = true;
	private boolean openingWindow = false;

  public PreferencesWindowMore() {
    initComponents();
		setStatus();
		boolean debug = DEBUG;
		DEBUG = false;
		openingWindow = true;
		prefs = PreferencesUser.getInstance();
		prefMoreHTML.setSelected(prefs.getAtSaveMakeHTML());
		prefMoreClean.setSelected(prefs.getAtSaveCleanBundle());
		prefMoreRunSave.setSelected(prefs.getPrefMoreRunSave());
//TODO: implement prefMoreHighlight
		prefMoreHighlight.setSelected(prefs.getPrefMoreHighlight());
//TODO: implement prefMoreImages
		prefMoreImages.setSelected(prefs.getPrefMoreImages());
		if (! prefs.getPrefMoreImagesPath().isEmpty()) {
			prefMoreImagesPath.setText(prefs.getPrefMoreImagesPath());
		}
		prefMoreMessage.setSelected(prefs.getPrefMoreMessage() == PreferencesUser.HORIZONTAL);
//TODO: command bar as menu
		prefMoreCommand.setSelected(prefs.getPrefMoreCommandBar());
		prefMoreLogActions.setSelected(prefs.getPrefMoreLogActions());
		prefMoreLogDebug.setSelected(prefs.getPrefMoreLogDebug());
		prefMoreLogInfo.setSelected(prefs.getPrefMoreLogInfo());
		prefMoreTextSearch.setSelected(prefs.getPrefMoreTextSearch());
		prefMoreTextOCR.setSelected(prefs.getPrefMoreTextOCR());
		prefMoreScripter.setSelected(prefs.getUserType() == PreferencesUser.SCRIPTER);
		prefMoreImageThumbs.setSelected(prefs.getPrefMoreImageThumbs());
		prefMorePlainText.setSelected(prefs.getPrefMorePlainText());
		DEBUG = debug;
		openingWindow = false;
	}

  /**
   * This method is called from within the constructor to initialize the form.
   * WARNING: Do NOT modify this code. The content of this method is always
   * regenerated by the Form Editor.
   */
  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    jTextField1 = new javax.swing.JTextField();
    jToggleButton1 = new javax.swing.JToggleButton();
    buttonGroup1 = new javax.swing.ButtonGroup();
    buttonGroup2 = new javax.swing.ButtonGroup();
    jCheckBox4 = new javax.swing.JCheckBox();
    jPanel1 = new javax.swing.JPanel();
    jButton1 = new javax.swing.JButton();
    jButton2 = new javax.swing.JButton();
    jCheckBox6 = new javax.swing.JCheckBox();
    prefMoreLblSave = new javax.swing.JLabel();
    prefMoreHTML = new javax.swing.JCheckBox();
    prefMoreClean = new javax.swing.JCheckBox();
    prefMoreLblRun = new javax.swing.JLabel();
    prefMoreRunSave = new javax.swing.JCheckBox();
    prefMoreLblImages = new javax.swing.JLabel();
    prefMoreImages = new javax.swing.JCheckBox();
    prefMoreImagesPath = new javax.swing.JTextField();
    prefMoreHighlight = new javax.swing.JCheckBox();
    jSeparator1 = new javax.swing.JSeparator();
    jSeparator2 = new javax.swing.JSeparator();
    jSeparator3 = new javax.swing.JSeparator();
    jSeparator4 = new javax.swing.JSeparator();
    prefMoreLblTitle = new javax.swing.JLabel();
    jSeparator5 = new javax.swing.JSeparator();
    prefMoreBtnOk = new javax.swing.JButton();
    prefMoreLblLayout = new javax.swing.JLabel();
    prefMoreMessage = new javax.swing.JCheckBox();
    prefMoreCommand = new javax.swing.JCheckBox();
    jSeparator6 = new javax.swing.JSeparator();
    prefMoreLblLogsOld = new javax.swing.JLabel();
    jSeparator7 = new javax.swing.JSeparator();
    prefMoreLogActions = new javax.swing.JCheckBox();
    prefMoreLogInfo = new javax.swing.JCheckBox();
    prefMoreLogDebug = new javax.swing.JCheckBox();
    jSeparator8 = new javax.swing.JSeparator();
    prefMoreLblText = new javax.swing.JLabel();
    prefMoreTextSearch = new javax.swing.JCheckBox();
    prefMoreTextOCR = new javax.swing.JCheckBox();
    jLabel1 = new javax.swing.JLabel();
    prefMoreScripter = new javax.swing.JCheckBox();
    jSeparator9 = new javax.swing.JSeparator();
    prefMoreLblStatus = new javax.swing.JLabel();
    prefMoreLblTitle1 = new javax.swing.JLabel();
    prefMoreImageThumbs = new javax.swing.JCheckBox();
    prefMorePlainText = new javax.swing.JCheckBox();
    jSeparator10 = new javax.swing.JSeparator();

    jTextField1.setText("jTextField1");

    jToggleButton1.setText("jToggleButton1");

    jCheckBox4.setText("jCheckBox4");

    org.jdesktop.layout.GroupLayout jPanel1Layout = new org.jdesktop.layout.GroupLayout(jPanel1);
    jPanel1.setLayout(jPanel1Layout);
    jPanel1Layout.setHorizontalGroup(
      jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
      .add(0, 100, Short.MAX_VALUE)
    );
    jPanel1Layout.setVerticalGroup(
      jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
      .add(0, 100, Short.MAX_VALUE)
    );

    jButton1.setText("jButton1");

    jButton2.setText("jButton2");

    jCheckBox6.setText("jCheckBox6");

    prefMoreLblSave.setText("Options on Save");

    prefMoreHTML.setText("create HTML");
    prefMoreHTML.addChangeListener(new javax.swing.event.ChangeListener() {
      public void stateChanged(javax.swing.event.ChangeEvent evt) {
        prefMoreHTMLStateChanged(evt);
      }
    });

    prefMoreClean.setText("delete not used images");
    prefMoreClean.addChangeListener(new javax.swing.event.ChangeListener() {
      public void stateChanged(javax.swing.event.ChangeEvent evt) {
        prefMoreCleanStateChanged(evt);
      }
    });

    prefMoreLblRun.setText("Options on Run");

    prefMoreRunSave.setText("autosave all");
    prefMoreRunSave.addChangeListener(new javax.swing.event.ChangeListener() {
      public void stateChanged(javax.swing.event.ChangeEvent evt) {
        prefMoreRunSaveStateChanged(evt);
      }
    });

    prefMoreLblImages.setText("Where to store images?");

    prefMoreImages.setText("use a global Repository *");
    prefMoreImages.setToolTipText("... restart needed"); // NOI18N
    prefMoreImages.addChangeListener(new javax.swing.event.ChangeListener() {
      public void stateChanged(javax.swing.event.ChangeEvent evt) {
        prefMoreImagesStateChanged(evt);
      }
    });

    prefMoreImagesPath.setText("PathToRepository (absolute or relative to bundle path)");
    prefMoreImagesPath.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        prefMoreImagesPathActionPerformed(evt);
      }
    });
    prefMoreImagesPath.addKeyListener(new java.awt.event.KeyAdapter() {
      public void keyTyped(java.awt.event.KeyEvent evt) {
        prefMoreImagesPathKeyTyped(evt);
      }
    });

    prefMoreHighlight.setText("always highlight");
    prefMoreHighlight.addChangeListener(new javax.swing.event.ChangeListener() {
      public void stateChanged(javax.swing.event.ChangeEvent evt) {
        prefMoreHighlightStateChanged(evt);
      }
    });

    prefMoreLblTitle.setText("Preferences: more options ...");

    prefMoreBtnOk.setText("Save");
    prefMoreBtnOk.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        prefMoreBtnOkActionPerformed(evt);
      }
    });

    prefMoreLblLayout.setText("IDE Layout");

    prefMoreMessage.setText("message area at bottom *");
    prefMoreMessage.setToolTipText("OFF --- message area on right sight, ON --- bottom (restart needed)"); // NOI18N
    prefMoreMessage.addChangeListener(new javax.swing.event.ChangeListener() {
      public void stateChanged(javax.swing.event.ChangeEvent evt) {
        prefMoreMessageStateChanged(evt);
      }
    });

    prefMoreCommand.setText("CommandBar (old style) *");
    prefMoreCommand.setToolTipText("OFF --- no command bar - commands in Tools menu instaed, ON --- old style (restart needed)");
    prefMoreCommand.addChangeListener(new javax.swing.event.ChangeListener() {
      public void stateChanged(javax.swing.event.ChangeEvent evt) {
        prefMoreCommandStateChanged(evt);
      }
    });

    prefMoreLblLogsOld.setText("Messages to show");

    prefMoreLogActions.setText("Actions");
    prefMoreLogActions.addChangeListener(new javax.swing.event.ChangeListener() {
      public void stateChanged(javax.swing.event.ChangeEvent evt) {
        prefMoreLogActionsStateChanged(evt);
      }
    });

    prefMoreLogInfo.setText("Info");
    prefMoreLogInfo.addChangeListener(new javax.swing.event.ChangeListener() {
      public void stateChanged(javax.swing.event.ChangeEvent evt) {
        prefMoreLogInfoStateChanged(evt);
      }
    });

    prefMoreLogDebug.setText("Debug");
    prefMoreLogDebug.addChangeListener(new javax.swing.event.ChangeListener() {
      public void stateChanged(javax.swing.event.ChangeEvent evt) {
        prefMoreLogDebugStateChanged(evt);
      }
    });

    prefMoreLblText.setText("TextSearch and OCR");
    prefMoreLblText.setToolTipText("... only if you know what you are doing ;-)"); // NOI18N

    prefMoreTextSearch.setText("allow searching for text");
    prefMoreTextSearch.setToolTipText("... only if you know what you are doing ;-)"); // NOI18N
    prefMoreTextSearch.addChangeListener(new javax.swing.event.ChangeListener() {
      public void stateChanged(javax.swing.event.ChangeEvent evt) {
        prefMoreTextSearchStateChanged(evt);
      }
    });

    prefMoreTextOCR.setText("allow OCR");
    prefMoreTextOCR.setToolTipText("... only if you know what you are doing ;-)"); // NOI18N
    prefMoreTextOCR.addChangeListener(new javax.swing.event.ChangeListener() {
      public void stateChanged(javax.swing.event.ChangeEvent evt) {
        prefMoreTextOCRStateChanged(evt);
      }
    });

    prefMoreScripter.setText("Activate the new layout (X-1.0) *  (no CommandBar, MessageArea on right side)");
    prefMoreScripter.setToolTipText("... no command bar - in Tools menu instead, message area on right side, some more options ..."); // NOI18N
    prefMoreScripter.addChangeListener(new javax.swing.event.ChangeListener() {
      public void stateChanged(javax.swing.event.ChangeEvent evt) {
        prefMoreScripterStateChanged(evt);
      }
    });

    prefMoreLblTitle1.setText("* these prefs need a restart of the IDE - others are active after save (no restart needed)");

    prefMoreImageThumbs.setText("ImageThumbs (on) / ImageLabels (off) *");
    prefMoreImageThumbs.addChangeListener(new javax.swing.event.ChangeListener() {
      public void stateChanged(javax.swing.event.ChangeEvent evt) {
        prefMoreThumbsStateChanged(evt);
      }
    });

    prefMorePlainText.setText("show script as plain text");
    prefMorePlainText.addChangeListener(new javax.swing.event.ChangeListener() {
      public void stateChanged(javax.swing.event.ChangeEvent evt) {
        prefMorePlainStateChanged(evt);
      }
    });

    org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(this);
    this.setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
      .add(layout.createSequentialGroup()
        .add(6, 6, 6)
        .add(jSeparator5, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 564, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
      .add(layout.createSequentialGroup()
        .add(192, 192, 192)
        .add(prefMoreLblTitle))
      .add(layout.createSequentialGroup()
        .add(26, 26, 26)
        .add(prefMoreLblTitle1))
      .add(layout.createSequentialGroup()
        .add(6, 6, 6)
        .add(jSeparator1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 564, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
      .add(layout.createSequentialGroup()
        .add(32, 32, 32)
        .add(prefMoreLblSave)
        .add(73, 73, 73)
        .add(prefMoreHTML)
        .add(75, 75, 75)
        .add(prefMoreClean))
      .add(layout.createSequentialGroup()
        .add(6, 6, 6)
        .add(jSeparator2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 564, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
      .add(layout.createSequentialGroup()
        .add(32, 32, 32)
        .add(prefMoreLblRun)
        .add(77, 77, 77)
        .add(prefMoreRunSave)
        .add(78, 78, 78)
        .add(prefMoreHighlight))
      .add(jSeparator3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 570, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
      .add(layout.createSequentialGroup()
        .add(32, 32, 32)
        .add(prefMoreLblImages)
        .add(30, 30, 30)
        .add(prefMoreImages))
      .add(layout.createSequentialGroup()
        .add(32, 32, 32)
        .add(prefMoreImagesPath, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 538, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
      .add(layout.createSequentialGroup()
        .add(6, 6, 6)
        .add(jSeparator4, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 564, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
      .add(layout.createSequentialGroup()
        .add(32, 32, 32)
        .add(prefMoreLblLayout)
        .add(40, 40, 40)
        .add(prefMoreMessage)
        .add(26, 26, 26)
        .add(prefMoreCommand))
      .add(layout.createSequentialGroup()
        .add(6, 6, 6)
        .add(jSeparator6, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 564, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
      .add(layout.createSequentialGroup()
        .add(32, 32, 32)
        .add(prefMoreLblLogsOld)
        .add(63, 63, 63)
        .add(prefMoreLogActions)
        .add(50, 50, 50)
        .add(prefMoreLogInfo)
        .add(57, 57, 57)
        .add(prefMoreLogDebug))
      .add(layout.createSequentialGroup()
        .add(6, 6, 6)
        .add(jSeparator7, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 564, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
      .add(layout.createSequentialGroup()
        .add(33, 33, 33)
        .add(prefMoreLblText)
        .add(48, 48, 48)
        .add(prefMoreTextSearch)
        .add(61, 61, 61)
        .add(prefMoreTextOCR))
      .add(layout.createSequentialGroup()
        .add(6, 6, 6)
        .add(jSeparator8, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 564, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
      .add(layout.createSequentialGroup()
        .add(32, 32, 32)
        .add(prefMoreScripter))
      .add(layout.createSequentialGroup()
        .add(6, 6, 6)
        .add(jSeparator9, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 564, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
      .add(layout.createSequentialGroup()
        .add(32, 32, 32)
        .add(prefMoreImageThumbs)
        .add(47, 47, 47)
        .add(prefMorePlainText))
      .add(layout.createSequentialGroup()
        .add(6, 6, 6)
        .add(jSeparator10, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 564, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
      .add(layout.createSequentialGroup()
        .add(495, 495, 495)
        .add(prefMoreBtnOk))
      .add(layout.createSequentialGroup()
        .add(59, 59, 59)
        .add(prefMoreLblStatus))
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
      .add(layout.createSequentialGroup()
        .add(jSeparator5, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 10, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
        .add(6, 6, 6)
        .add(prefMoreLblTitle)
        .add(12, 12, 12)
        .add(prefMoreLblTitle1)
        .add(6, 6, 6)
        .add(jSeparator1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 10, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
        .add(6, 6, 6)
        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
          .add(layout.createSequentialGroup()
            .add(4, 4, 4)
            .add(prefMoreLblSave))
          .add(prefMoreHTML)
          .add(prefMoreClean))
        .add(4, 4, 4)
        .add(jSeparator2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 10, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
        .add(4, 4, 4)
        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
          .add(layout.createSequentialGroup()
            .add(4, 4, 4)
            .add(prefMoreLblRun))
          .add(prefMoreRunSave)
          .add(prefMoreHighlight))
        .add(5, 5, 5)
        .add(jSeparator3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 10, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
        .add(3, 3, 3)
        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
          .add(layout.createSequentialGroup()
            .add(4, 4, 4)
            .add(prefMoreLblImages))
          .add(prefMoreImages))
        .add(6, 6, 6)
        .add(prefMoreImagesPath, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
        .add(6, 6, 6)
        .add(jSeparator4, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 10, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
        .add(6, 6, 6)
        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
          .add(layout.createSequentialGroup()
            .add(4, 4, 4)
            .add(prefMoreLblLayout))
          .add(prefMoreMessage)
          .add(prefMoreCommand))
        .add(6, 6, 6)
        .add(jSeparator6, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 10, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
        .add(12, 12, 12)
        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
          .add(layout.createSequentialGroup()
            .add(4, 4, 4)
            .add(prefMoreLblLogsOld))
          .add(prefMoreLogActions)
          .add(prefMoreLogInfo)
          .add(prefMoreLogDebug))
        .add(12, 12, 12)
        .add(jSeparator7, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 10, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
        .add(12, 12, 12)
        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
          .add(layout.createSequentialGroup()
            .add(4, 4, 4)
            .add(prefMoreLblText))
          .add(prefMoreTextSearch)
          .add(prefMoreTextOCR))
        .add(12, 12, 12)
        .add(jSeparator8, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 10, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
        .add(6, 6, 6)
        .add(prefMoreScripter)
        .add(6, 6, 6)
        .add(jSeparator9, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 10, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
        .add(6, 6, 6)
        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
          .add(prefMoreImageThumbs)
          .add(prefMorePlainText))
        .add(6, 6, 6)
        .add(jSeparator10, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 10, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
        .add(6, 6, 6)
        .add(prefMoreBtnOk)
        .add(6, 6, 6)
        .add(prefMoreLblStatus))
    );
  }// </editor-fold>//GEN-END:initComponents

	private void setStatus() {
			setStatus("...");
	}

	private void setStatus(String text) {
		setStatus(text, false);
	}

	private void setStatus(String text, boolean force) {
		if (DEBUG || force) {
			prefMoreLblStatus.setText(text);
		}
	}

	private boolean isSelected(JCheckBox cb) {
		if (cb.getSelectedObjects() != null) {
			setStatus("ON --- "+cb.getText());
			return true;
		}
		else {
			setStatus("OFF --- "+cb.getText());
			return false;
		}
  }

	private void savePrefs(String msg)	{
		prefs.setAtSaveMakeHTML(isSelected(prefMoreHTML));
		prefs.setAtSaveCleanBundle(isSelected(prefMoreClean));
		prefs.setPrefMoreRunSave(isSelected(prefMoreRunSave));
		prefs.setPrefMoreHighlight(isSelected(prefMoreHighlight));
		prefs.setPrefMoreImages(isSelected(prefMoreImages));
		prefs.setPrefMoreMessage(isSelected(prefMoreMessage) ? PreferencesUser.HORIZONTAL : PreferencesUser.VERTICAL);
		prefs.setPrefMoreCommandBar(isSelected(prefMoreCommand));
		prefs.setPrefMoreLogActions(isSelected(prefMoreLogActions));
		prefs.setPrefMoreLogInfo(isSelected(prefMoreLogInfo));
		prefs.setPrefMoreLogDebug(isSelected(prefMoreLogDebug));
		prefs.setPrefMoreTextSearch(isSelected(prefMoreTextSearch));
		prefs.setPrefMoreTextOCR(isSelected(prefMoreTextOCR));
		prefs.setPrefMoreImageThumbs(isSelected(prefMoreImageThumbs));
		prefs.setPrefMorePlainText(isSelected(prefMorePlainText));
		prefs.setUserType(isSelected(prefMoreScripter)?PreferencesUser.SCRIPTER:PreferencesUser.SIKULI_USER);
		if (! prefMoreImagesPath.getText().startsWith("PathToRepository")) {
			prefs.setPrefMoreImagesPath(prefMoreImagesPath.getText());
		}
		setStatus(msg, true);
	}

  private void prefMoreBtnOkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prefMoreBtnOkActionPerformed
		savePrefs("Settings saved");
  }//GEN-LAST:event_prefMoreBtnOkActionPerformed

  private void prefMoreHighlightStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_prefMoreHighlightStateChanged
		isSelected(prefMoreHighlight);
  }//GEN-LAST:event_prefMoreHighlightStateChanged

  private void prefMoreCleanStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_prefMoreCleanStateChanged
		isSelected(prefMoreClean);
  }//GEN-LAST:event_prefMoreCleanStateChanged

  private void prefMoreHTMLStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_prefMoreHTMLStateChanged
		isSelected(prefMoreHTML);
  }//GEN-LAST:event_prefMoreHTMLStateChanged

  private void prefMoreRunSaveStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_prefMoreRunSaveStateChanged
		isSelected(prefMoreRunSave);
  }//GEN-LAST:event_prefMoreRunSaveStateChanged

  private void prefMoreImagesStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_prefMoreImagesStateChanged
		isSelected(prefMoreImages);
  }//GEN-LAST:event_prefMoreImagesStateChanged

  private void prefMoreScripterStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_prefMoreScripterStateChanged
    if (isSelected(prefMoreScripter)) {
			if (! openingWindow) {
				prefMoreMessage.setSelected(false);
				prefMoreCommand.setSelected(false);
				prefMoreHTML.setSelected(false);
				prefMoreRunSave.setSelected(true);
				prefMoreLogActions.setSelected(false);
				prefMoreLogDebug.setSelected(false);
				prefMoreLogInfo.setSelected(false);
				prefMoreImageThumbs.setSelected(false);
				prefMorePlainText.setSelected(false);
				savePrefs("Switched to new Layout - Restart IDE!");
			}
		}
		else {
			prefMoreImageThumbs.setSelected(true);
			prefMorePlainText.setSelected(false);
			prefMoreMessage.setSelected(true);
			prefMoreCommand.setSelected(true);
			prefMoreLogActions.setSelected(true);
			prefMoreLogDebug.setSelected(true);
			prefMoreLogInfo.setSelected(true);
			savePrefs("Switched to old Layout - Restart IDE!");
		}

  }//GEN-LAST:event_prefMoreScripterStateChanged

  private void prefMoreLogActionsStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_prefMoreLogActionsStateChanged
		isSelected(prefMoreLogActions);
  }//GEN-LAST:event_prefMoreLogActionsStateChanged

  private void prefMoreLogDebugStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_prefMoreLogDebugStateChanged
		isSelected(prefMoreLogDebug);
  }//GEN-LAST:event_prefMoreLogDebugStateChanged

  private void prefMoreLogInfoStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_prefMoreLogInfoStateChanged
		isSelected(prefMoreLogInfo);
  }//GEN-LAST:event_prefMoreLogInfoStateChanged

  private void prefMoreMessageStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_prefMoreMessageStateChanged
		isSelected(prefMoreMessage);
  }//GEN-LAST:event_prefMoreMessageStateChanged

  private void prefMoreCommandStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_prefMoreCommandStateChanged
		isSelected(prefMoreCommand);
  }//GEN-LAST:event_prefMoreCommandStateChanged

  private void prefMoreImagesPathKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_prefMoreImagesPathKeyTyped
    // TODO add your handling code here:
  }//GEN-LAST:event_prefMoreImagesPathKeyTyped

  private void prefMoreTextSearchStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_prefMoreTextSearchStateChanged
		isSelected(prefMoreTextSearch);
  }//GEN-LAST:event_prefMoreTextSearchStateChanged

  private void prefMoreTextOCRStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_prefMoreTextOCRStateChanged
		isSelected(prefMoreTextOCR);
  }//GEN-LAST:event_prefMoreTextOCRStateChanged

  private void prefMoreImagesPathActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prefMoreImagesPathActionPerformed
    // TODO add your handling code here:
  }//GEN-LAST:event_prefMoreImagesPathActionPerformed

  private void prefMoreThumbsStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_prefMoreThumbsStateChanged
		isSelected(prefMoreImageThumbs);
  }//GEN-LAST:event_prefMoreThumbsStateChanged

  private void prefMorePlainStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_prefMorePlainStateChanged
    isSelected(prefMorePlainText);
  }//GEN-LAST:event_prefMorePlainStateChanged

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.ButtonGroup buttonGroup1;
  private javax.swing.ButtonGroup buttonGroup2;
  private javax.swing.JButton jButton1;
  private javax.swing.JButton jButton2;
  private javax.swing.JCheckBox jCheckBox4;
  private javax.swing.JCheckBox jCheckBox6;
  private javax.swing.JLabel jLabel1;
  private javax.swing.JPanel jPanel1;
  private javax.swing.JSeparator jSeparator1;
  private javax.swing.JSeparator jSeparator10;
  private javax.swing.JSeparator jSeparator2;
  private javax.swing.JSeparator jSeparator3;
  private javax.swing.JSeparator jSeparator4;
  private javax.swing.JSeparator jSeparator5;
  private javax.swing.JSeparator jSeparator6;
  private javax.swing.JSeparator jSeparator7;
  private javax.swing.JSeparator jSeparator8;
  private javax.swing.JSeparator jSeparator9;
  private javax.swing.JTextField jTextField1;
  private javax.swing.JToggleButton jToggleButton1;
  private javax.swing.JButton prefMoreBtnOk;
  private javax.swing.JCheckBox prefMoreClean;
  private javax.swing.JCheckBox prefMoreCommand;
  private javax.swing.JCheckBox prefMoreHTML;
  private javax.swing.JCheckBox prefMoreHighlight;
  private javax.swing.JCheckBox prefMoreImageThumbs;
  private javax.swing.JCheckBox prefMoreImages;
  private javax.swing.JTextField prefMoreImagesPath;
  private javax.swing.JLabel prefMoreLblImages;
  private javax.swing.JLabel prefMoreLblLayout;
  private javax.swing.JLabel prefMoreLblLogsOld;
  private javax.swing.JLabel prefMoreLblRun;
  private javax.swing.JLabel prefMoreLblSave;
  private javax.swing.JLabel prefMoreLblStatus;
  private javax.swing.JLabel prefMoreLblText;
  private javax.swing.JLabel prefMoreLblTitle;
  private javax.swing.JLabel prefMoreLblTitle1;
  private javax.swing.JCheckBox prefMoreLogActions;
  private javax.swing.JCheckBox prefMoreLogDebug;
  private javax.swing.JCheckBox prefMoreLogInfo;
  private javax.swing.JCheckBox prefMoreMessage;
  private javax.swing.JCheckBox prefMorePlainText;
  private javax.swing.JCheckBox prefMoreRunSave;
  private javax.swing.JCheckBox prefMoreScripter;
  private javax.swing.JCheckBox prefMoreTextOCR;
  private javax.swing.JCheckBox prefMoreTextSearch;
  // End of variables declaration//GEN-END:variables
}
