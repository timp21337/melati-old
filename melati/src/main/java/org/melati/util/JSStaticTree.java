package org.melati.util;

public class JSStaticTree extends Tree {

    private String nodeLabelTemplet = "template/webmacro/templets/html/StaticNode.wm";
    private String backgroundColour = "FFFFFF";
    private String verticalLinkImage = "/melati-static/admin/vertline.gif";
    private String spacerImage = "/melati-static/admin/spacer.gif";
    private String openedFolderImage = "/melati-static/admin/openfolder.gif";
    private String closedFolderImage = "/melati-static/admin/closedfolder.gif";
    private String openedTImage = "/melati-static/admin/node_minus.gif";
    private String closedTImage = "/melati-static/admin/node_plus.gif";
    private String openedLImage = "/melati-static/admin/lastnode_minus.gif";
    private String closedLImage = "/melati-static/admin/lastnode_plus.gif";
    private String leafTImage = "/melati-static/admin/node.gif";
    private String leafLImage = "/melati-static/admin/last_node.gif";
    private String leafImage = "/melati-static/admin/file.gif";
    private String imageBaseRef = "/melati-static/admin";
    private Integer depthPerDownload = new Integer(-1);

    public JSStaticTree(Tree tree) {
        super(tree.getTreeableRoots(), tree.getDepth());
    }

    public String getNodeLabelTemplet() {
        return nodeLabelTemplet;
    }

    public void setNodeLabelTemplet(String nlt) {
        nodeLabelTemplet = nlt;
    }

    public String getBackgroundColour() {
        return backgroundColour;
    }

    public void setBackgroundColour(String bg) {
        backgroundColour = bg;
    }

    public String getVerticalLinkImage() {
        return verticalLinkImage;
    }

    public void setVerticalLinkImage(String vli) {
        verticalLinkImage = vli;
    }

    public String getSpacerImage() {
        return spacerImage;
    }

    public void setSpacerImage(String si) {
        spacerImage = si;
    }

    public String getOpenedFolderImage() {
        return openedFolderImage;
    }

    public void setOpenedFolderImage(String ofi) {
        openedFolderImage = ofi;
    }

    public String getClosedFolderImage() {
        return closedFolderImage;
    }

    public void setClosedFolderImage(String cfi) {
        closedFolderImage = cfi;
    }

    public String getOpenedTImage() {
        return openedTImage;
    }

    public void setOpenedTImage(String oti) {
        openedTImage = oti;
    }

    public String getOpenedLImage() {
        return openedLImage;
    }

    public void setOpenedLImage(String oli) {
        openedLImage = oli;
    }

    public String getClosedTImage() {
        return closedTImage;
    }

    public void setClosedTImage(String cti) {
        closedTImage = cti;
    }

    public String getClosedLImage() {
        return closedLImage;
    }

    public void setClosedLImage(String cli) {
        closedLImage = cli;
    }

    public String getLeafTImage() {
        return leafTImage;
    }

    public void setLeafTImage(String li) {
        leafTImage = li;
    }

    public String getLeafLImage() {
        return leafLImage;
    }

    public void setLeafLImage(String li) {
        leafLImage = li;
    }

    public String getLeafImage() {
        return leafImage;
    }

    public void setLeafImage(String li) {
        leafImage = li;
    }

    public String getImageBaseRef() {
        return imageBaseRef;
    }

    public void setImageBaseRef(String ibr) {
        imageBaseRef = ibr;
    }

    public Integer getDepthPerDownload() {
        return depthPerDownload;
    }

    public void setDepthPerDownload(Integer dpd) {
        depthPerDownload = dpd;
    }

}




