package co.com.cetus.common.mail;

public class HtmlMail {
	private StringBuffer html;

	public HtmlMail() {
		html = new StringBuffer();
	}

	public String getDocType() {
		return "<!DOCTYPE html PUBLIC '-//W3C//DTD XHTML 1.0 Transitional//EN' 'http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd'>";
	}

	public String getBodyOpen() {
		return "<body>";
	}

	public String getBodyClose() {
		return "</body>";
	}

	public String getHeadOpen() {
		return "<head>";
	}

	public String getHeadClose() {
		return "</head>";
	}

	public String getTitleOpen() {
		return "<title>";
	}

	public String getTitleClose() {
		return "</title>";
	}

	public String getTableOpen() {
		return "<table width='100%'>";
	}

	public String getTableClose() {
		return "</table>";
	}

	public String getRowOpen() {
		return "<tr>";
	}

	public String getRowClose() {
		return "</tr>";
	}

	public String getColumnOpen() {
		return "<td>";
	}

	public String getColumnOpen(String pColspan) {
		return "<td  colspan ='" + pColspan + "' >";
	}

	public String getColumnClose() {
		return "</td>";
	}

	public String getSpanOpen() {
		return "<span>";
	}

	public String getSpanClose() {
		return "</span>";
	}

	public StringBuffer pageBasic(String pTitulo, String pInfoCabecera,
			String pInfoBody) {
		html.append(getDocType());
		html.append(getHeadOpen());
		html.append(getTitleOpen());
		html.append(pTitulo);
		html.append(getTitleClose());
		html.append(getHeadClose());
		html.append(getBodyOpen());
		html.append(getTableOpen());
		html.append(getRowOpen());
		html.append(getColumnOpen("1"));
		html.append(getSpanOpen());
		html.append(pInfoCabecera);
		html.append(getSpanClose());
		html.append(getColumnClose());
		html.append(getRowClose());
		html.append(getRowOpen());
		html.append(getColumnOpen("1"));
		html.append(pInfoBody);
		html.append(getColumnClose());
		html.append(getRowClose());
		html.append(getTableClose());
		html.append(getBodyClose());
		return html;
	}

	public StringBuffer getHtml() {
		return html;
	}

	public void setHtml(StringBuffer html) {
		this.html = html;
	}

}
