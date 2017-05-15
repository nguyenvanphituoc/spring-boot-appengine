<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="t" tagdir="/WEB-INF/tags"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" />
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<script
	src="https://ajax.googleapis.com/ajax/libs/angularjs/1.4.8/angular.min.js"></script>
<t:templetepage>

	<jsp:attribute name="header">     
    </jsp:attribute>
	<jsp:attribute name="footer">
    </jsp:attribute>
	<jsp:body>
			<link href="/resources/Modules/TopicArticleDisplay.css" rel="stylesheet"
			type="text/css" />

<script type="text/javascript">
    function OnSendArticle() {
        var result = window.showModalDialog("/resources/Modules/CMS/SendArticle.aspx", document.URL, "dialogHeight: 320px; dialogWidth: 450px;");
    }
    function OnBack() {
        window.history.back();
    }
    function OnGoToHead() {
        window.moveTo(0, 0);
    }

</script>
<script type="text/javascript">

    $(document).ready(function () {

        $(".slidingDiv").hide();
        $(".show_hide").show();

        $('.show_hide').click(function () {
            $(".slidingDiv").slideToggle();
        });

    });

</script>
<style type="text/css">
.bg_display {
	clear: both;
	float: left;
	background: #fff;
}

.title_display {
	color: #9F0E13;
	font-weight: bold;
	font-size: 14px;
	text-transform: uppercase;
	border-bottom: 1px dashed #0280bb;
	padding: 5px 0px 5px 10px;
	margin: 0px 10px;
}

.title_display a {
	color: #333 !important;
}

.title_display a:hover {
	color: #FF0000 !important;
}

.ct_tin_display {
	float: left;
	width: 670px;
	padding-bottom: 15px;
}

.articleTitle a {
	margin: 0px 5px 0px 5px;
	margin-bottom: 10px;
	color: #0280BB;
	font-weight: bold;
	font-size: 16px;
}

.articleDescription p {
	font: 13px Arial;
	color: #000;
	line-height: 20px;
	margin: 0px 5px 0px 5px;
}

.articleContent {
	font: 13px Arial;
	line-height: 150%;
	text-align: justify;
	margin: 0px 5px 0px 5px;
}

.articleContent ol, .articleContent ul {
	padding-left: 40px;
}

.articleContent a, .articleContent p, .articleContent span,
	.articleContent h1, .articleContent h2, .articleContent h3,
	.articleContent h4, .articleContent h5, .articleContent h6,
	.articleContent div, .articleContent ul, .articleContent li,
	.articleContent table, .articleContent th, .articleContent tr,
	.articleContent td {
	font-family: Arial;
	font-size: 13px;
	text-align: justify;
	line-height: 150%;
}

.tinkhac_display {
	float: left;
	width: 670px;
	margin: 0px 5px 0px 25px;
	list-style-image: url(/resources/Resources/ImagesPortal/HomePage/arrow.png);
}

.tinkhac_display a {
	font: 13px Arial;
	line-height: 20px;
	color: #333;
}

.tinkhac_display a:hover {
	color: #FF0000;
}
</style>

<div class="bg_display">
    <div class="display" style="float: left; width: 100%;">
        <div class="title_display">
             <a style='color: #666;'
						href=indexc059.html?TopicId=31ca0f13-71be-4bd9-ad28-d3589a3cf6d2>Latest news </a> 
        </div>
        <div style="margin-top: 10px;">
            <div style="margin-left: 5px; margin-bottom: 10px;">
                <div class="ct_tin_display">
                    <div class="articleTitle">
                        <a
									href="index52be.html?ArticleId=3af2fa01-2645-4516-a65a-67bfec768e13">SPECIAL SESSION 02 FOR ICSSE2017: FUZZY SYSTEMS AND ITS APPLICATIONS</a>
                    </div>
                    <div
								style="float: left; width: 100%; margin: 5px 5px 5px 10px; display: none;">
                        <span
									style="font-weight: bold; font-style: italic">Tác giả </span>:
                    </div>
                   
                    <div class="articleContent">
                        <span style="font-size: 16px;"><br />
<span style="font-size: 16px;"><strong><span
											style="font-size: 16px; color: #c00000;">Introduction/Call for Papers</span></strong><br />
<span style="font-size: 16px; color: #002060;">This session aims at discussing the problems of fuzzy control system and its applications in practice. Nowadays, fuzzy control systems cover a wide range of fields in modern life such as controlling system, robotics, decision making and image processing &hellip;etc. Additionally, the trend of applying and studying fuzzy systems keep increasing in the future. Prospective authors from a variety of fields including fuzzy controller design, robotics, image processing &hellip;etc., are invited to submit original papers to the Special Session.</span><br />
<br />
<strong><span style="font-size: 16px; color: #c00000;">&nbsp;Topics of interests include but not limited to:</span></strong><br />
<span style="font-size: 16px; color: #002060;">&nbsp;- Fuzzy systems or fuzzy theories</span><br />
<span style="font-size: 16px; color: #002060;">&nbsp;- Any application by fuzzy logic or fuzzy reasoning</span><br />
<br />
All accepted papers that will be part of the conference proceedings, are expected to be included in IEEE Xplore and will be indexed by EI.<br />
</span>
</span>
<div>
									<span style="font-size: 16px;"><br />
</span>
								</div>
<p>
									<span style="text-align: left; font-size: 16px;"><strong><span
											style="font-size: 16px; color: #c00000;">Submission</span><br />
</strong>
</span>
								</p>
<div style="text-indent: 0px;">
									<span style="font-size: 16px;"><span
										style="text-indent: 36pt; font-size: 16px; color: #002060;">Submitted manuscripts should be within 2~6 pages in IEEE two-column format, including figures, tables, and references. Please use the templates at </span><span
										style="text-decoration: underline; line-height: 107%; font-size: 16px; color: #00b0f0;">Manuscript Templates for IEEE Conference Proceedings</span><span
										style="text-indent: 36pt; font-size: 16px; color: #002060;"> from the conference website to prepare your paper. All submissions MUST be in PDF format.</span></span>
								</div>
<p style="line-height: 15.75pt; text-align: center;">
									<span style="font-size: 16px;"><span
										style="font-size: 16px;"><br />
Complete manuscripts must be electronically submitted through Easychair system at: </span><strong><span
											style="background: #ffc000; text-decoration: none; font-size: 16px;"><a
												href="https://easychair.org/conferences/?conf=icsse2017specialsess"
												target="_blank" style="color: #002060;"><span
													style="font-size: 18px;">https://easychair.org/conferences/?conf=icsse2017specialsess</span></a><br />
</span></strong></span>
								</p>
<div style="text-indent: 0px; text-align: justify;">
									<span style="font-size: 14px;"><span
										style="font-size: 16px;"><strong
											style="font-weight: bold; color: #002060; background-color: #f3f3f3; font-size: 14px; text-indent: 21.3pt; text-align: left;"><span
												style="font-size: 16px; color: #c00000;"><br />
NOTE</span></strong><span
											style="font-weight: bold; background-color: #f3f3f3; text-indent: 21.3pt; text-align: left; font-size: 16px; color: #c00000;">: If you want to submit a paper for <strong>SPECIAL SESSION 02</strong> (FUZZY SYSTEMS AND ITS APPLICATIONS<strong>)</strong>, please add SS02- before title of your paper when you type the title on easy chair.<br />
</span><span
											style="font-weight: bold; text-indent: 21.3pt; background-color: #f3f3f3; text-align: left; font-size: 16px; color: #002060;">Example: </span></span><span
										style="font-size: 14px; text-indent: 21.3pt; background-color: #f3f3f3; text-align: left;"><span
											style="font-size: 16px;"><span
												style="font-style: italic; font-weight: bold; font-size: 16px; color: #002060;">SS02- Fuzzy Restricted Boltzmann Machine for the Enhancement of Deep Learnin</span><span
												style="font-style: italic; font-weight: bold; font-size: 16px;"><span
													style="color: #002060;">g</span><br />
</span><br />
</span>
<div style="text-align: center;">
												<span style="font-size: 16px;"><img alt=""
													src="Resources/Images/SubDomain/icsse2017/SS02.png"
													style="text-indent: 21.3pt;" /></span>
											</div>
<span style="font-size: 16px;"><br />
<span style="font-weight: bold; font-size: 16px; color: #c00000;">Important Dates</span><br />
<span style="font-size: 16px; color: #002060;">March 15, 2017: Deadline for submission of 2-page extended abstract papers to special sessions.<br />
March 30, 2017: Acceptance/Rejection Notification.<br />
May 10, 2017: Final camera-ready papers due in electronic form.</span><br />
<br />
<span style="font-weight: bold; font-size: 16px; color: #c00000;">Special Session organizers</span><br />
</span><span style="font-size: 16px; color: #002060;"><strong>Prof. Wen-June Wang</strong><br />
Department of Electrical Engineering<br />
National Central University<br />
JhongLi, 32001, Taiwan<br />
E-mail: <a href="wjwang%40ee.ncu.edu.html">wjwang@ee.ncu.edu.tw</a><br />
</span><br />
<br />
</span></span>
								</div>
                    </div>
                </div>
                                            
            </div>
            <div style="margin-left: 5px">
                <img style="float: left;"
							src="/resources/Resources/ImagesPortal/HomePage/tinkhac.png" />
                <a
							style="color: #0280BB; text-transform: uppercase; font: 13px Verdana; float: left; margin-left: 10px; font-weight: bold;"
							href="#">Others</a>
            </div>
            <div
						style="float: left; width: 670px; margin-bottom: 10px; padding-top: 5px; clear: both; margin: 0px 5px 0px 5px;">
                <div id="ctl06_ctl01_pnCactinkhac">
					
                    <ul>
                        
                                <li class="tinkhac_display"><a
									href="indexe41c.html?ArticleId=bc474489-26ce-4997-a1c0-b37dce27b202">
                                    ABSTRACT DEADLINE EXTENSION: MARCH 19, 2017<span
										style="font: italic 11px Arial, Helvetica, sans-serif; color: #999999">(07/03/2017)</span>
								</a> </li>
                            
                                <li class="tinkhac_display"><a
									href="indexc489.html?ArticleId=f796f938-0681-4d25-b47e-6bcd24536152">
                                    SPECIAL SESSION 01 FOR ICSSE2017: INTELLIGENT HEALTHCARE SYSTEMS<span
										style="font: italic 11px Arial, Helvetica, sans-serif; color: #999999"></span>
								</a> </li>
                            
                    </ul>
                
				</div>
            </div>

        </div>
    </div>
    <div id="ctl06_ctl01_ValidationSummary1"
				style="color: Red; display: none;">

				</div>
    
    <div
				style="margin-top: 10px; margin-right: 25px; margin-left: 20px; text-align: justify; float: left; margin-bottom: 10px; display: none;">
        <div style="float: left; width: 100%;">
            <div
						style="background: url(/resources/Resources/ImagesPortal/HomePage/guigopy.png) no-repeat; width: 76px; height: 24px; float: left;">
                <div
							style="font-weight: bold; font: 13px Verdana; color: #fff; padding-top: 3px; text-align: center;"
							class="show_hide">
                    Comments
                </div>
            </div>
        </div>
        <div
					style="font-family: Verdana; font-size: small; color: #FF0000; float: left; width: 100%;">
            
        </div>

        <div class="slidingDiv" style="float: left;">
            <table border="0" cellpadding="0" cellspacing="0"
						style="width: 100%;">
                <tr>
                    <td align="right"
								style="font-family: Verdana; font-size: 11px; color: #333; font-weight: bold; padding: 5px"
								width="80px">
                        Full Name:
                    </td>
                    <td align="left" style="width: 230px;">
                        <input name="ctl06$ctl01$txtFullName"
								type="text" id="ctl06_ctl01_txtFullName" style="width: 200px;" />
                        <span style="color: Red">*</span><span
								id="ctl06_ctl01_RequiredFieldValidator1" title="Required"
								style="color: Red; display: none;"></span>
                    </td>
                    <td align="left">&nbsp;
                
                    </td>
                </tr>
                <tr>
                    <td align="right"
								style="font-family: Verdana; color: #333; font-size: 11px; font-weight: bold; padding: 5px"
								width="80px">Email:
                    </td>
                    <td align="left" style="width: 230px;">
                        <input name="ctl06$ctl01$txtEmail" type="text"
								id="ctl06_ctl01_txtEmail" style="width: 200px;" />
                        <span style="color: Red">*</span><span
								id="ctl06_ctl01_RequiredFieldValidator3" title="Required"
								style="color: Red; display: none;"></span>
                        <span
								id="ctl06_ctl01_RegularExpressionValidator3"
								title="Invalid Email" style="color: Red; display: none;"></span>
                    </td>
                    <td align="left">&nbsp;
                
                    </td>
                </tr>
                <tr>
                    <td align="right"
								style="font-family: Verdana; font-size: 11px; color: #333; font-weight: bold; padding: 5px"
								width="80px">
                        Title:
                    </td>
                    <td align="left" style="width: 230px;">
                        <input name="ctl06$ctl01$txtTitle" type="text"
								id="ctl06_ctl01_txtTitle" style="width: 200px;" />
                        <span style="color: Red">*</span><span
								id="ctl06_ctl01_RequiredFieldValidator4" title="Required"
								style="color: Red; display: none;"></span>
                    </td>
                    <td align="left">&nbsp;
                
                    </td>
                </tr>
                <tr>
                    <td align="right"
								style="font-family: Verdana; font-size: 11px; color: #333; font-weight: bold; padding: 5px"
								width="80px">
                        Captcha:
                    </td>
                    <td align="left" style="width: 250px;">
                        <div id="ctl06_ctl01_RadCaptcha1"
									class="RadCaptcha RadCaptcha_Default" style="float: left;">
					<span id="ctl06_ctl01_RadCaptcha1_ctl00"
										style="color: Red; visibility: hidden;"></span>
									<div id="ctl06_ctl01_RadCaptcha1_SpamProtectorPanel">
						<img id="ctl06_ctl01_RadCaptcha1_CaptchaImage" alt=""
											src="Telerik.Web.UI.WebResourcedc3b.jpg?type=rca&amp;guid=9331537b-bcb4-47c9-beef-4af256066389"
											style="height: 50px; width: 150px; border-width: 0px; display: block;" />
					</div>
									<input id="ctl06_ctl01_RadCaptcha1_ClientState"
										name="ctl06_ctl01_RadCaptcha1_ClientState" type="hidden" />
				</div>
                        <input name="ctl06$ctl01$txtCapCha" type="text"
								id="ctl06_ctl01_txtCapCha" style="width: 204px;" />
                        <span id="ctl06_ctl01_RequiredFieldValidator6"
								title="Invalid Code" style="color: Red; visibility: hidden;">(*)</span>
                    </td>
                </tr>
                <tr>
                    <td align="right"
								style="font-family: Verdana; font-size: 11px; font-weight: bold; color: #fff; padding: 5px"
								colspan="3">
                        <div id="ctl06_ctl01_fckContent"
									class="RadEditor Default reWrapper"
									style="height: 210px; width: 380px; float: left;">
					<div id="ctl06_ctl01_fckContent_dialogOpener"
										style="display: none;">
						<div id="ctl06_ctl01_fckContent_dialogOpener_Window"
											style="display: none;">
							<div id="ctl06_ctl01_fckContent_dialogOpener_Window_C">

							</div>
											<input
												id="ctl06_ctl01_fckContent_dialogOpener_Window_ClientState"
												name="ctl06_ctl01_fckContent_dialogOpener_Window_ClientState"
												type="hidden" />
						</div>
										<input id="ctl06_ctl01_fckContent_dialogOpener_ClientState"
											name="ctl06_ctl01_fckContent_dialogOpener_ClientState"
											type="hidden" />
					</div>
									<table id="ctl06_ctl01_fckContentWrapper" cellpadding="0"
										cellspacing="0"
										style="table-layout: auto; width: 100%; height: 210px;">
						<tbody>
							<tr>
								<td class="reWrapper_corner reCorner_top_left">&nbsp;</td>
												<td class="reWrapper_center reCenter_top" colspan="3">&nbsp;</td>
												<td class="reWrapper_corner reCorner_top_right">&nbsp;</td>
							</tr>
											<tr>
								<td class="reLeftVerticalSide" rowspan="4">&nbsp;</td>
												<td rowspan="4" id="ctl06_ctl01_fckContentLeft"
													class="reTlbVertical"></td>
												<td id="ctl06_ctl01_fckContentTop" class="reToolCell"
													style="width: 100%;"><div
														class="Default reToolbarWrapper">
									<ul class="reToolbar Default">
										<li class="reGrip grip_first">&nbsp;</li>
															<li><a title="Bold" class="reTool" href="#"><span
																	class="Bold">&nbsp;</span></a></li>
															<li><a title="Italic" class="reTool" href="#"><span
																	class="Italic">&nbsp;</span></a></li>
															<li><a title="Align Left" class="reTool" href="#"><span
																	class="JustifyLeft">&nbsp;</span></a></li>
															<li><a title="Align Right" class="reTool" href="#"><span
																	class="JustifyRight">&nbsp;</span></a></li>
															<li><a title="Align Center" class="reTool" href="#"><span
																	class="JustifyCenter">&nbsp;</span></a></li>
															<li><a title="Justify" class="reTool" href="#"><span
																	class="JustifyFull">&nbsp;</span></a></li>
															<li class="reGrip grip_last">&nbsp;</li>
									</ul>
								</div></td>
												<td rowspan="4" id="ctl06_ctl01_fckContentRight"
													class="reTlbVertical"></td>
												<td rowspan="4" class="reRightVerticalSide">&nbsp;</td>
							</tr>
											<tr>
								<td valign="top" id="ctl06_ctl01_fckContentCenter"
													class="reContentCell" style="height: 100%;"><label
													for="ctl06_ctl01_fckContentContentHiddenTextarea"
													style="display: none;">RadEditor hidden textarea</label>
												<textarea id="ctl06_ctl01_fckContentContentHiddenTextarea"
														name="ctl06$ctl01$fckContent" rows="4" cols="20"
														style="display: none;"></textarea></td>
							</tr>
											<tr>
								<td class="reToolZone"><table cellpadding="0"
														cellspacing="0" id="ctl06_ctl01_fckContent_BottomTable"
														style="width: 100%;">
									<tbody>
										<tr>
											<td class="reEditorModesCell"><div class="reEditorModes"
																		id="ctl06_ctl01_fckContent_ModesWrapper">
												<ul>
													<li><a href="javascript:void(0);" title="Design"
																				class="reMode_design reMode_selected"><span>Design</span></a></li>
																			<li><a href="javascript:void(0);" title="HTML"
																				class="reMode_html"><span>HTML</span></a></li>
																			<li><a href="javascript:void(0);"
																				title="Preview" class="reMode_preview"><span>Preview</span></a></li>
												</ul>
											</div></td>
																<td class="reBottomZone"
																	id="ctl06_ctl01_fckContentBottom">&nbsp;</td>
																<td class="reResizeCell" valign="bottom" align="right"
																	style="width: 15px;"><div
																		id="ctl06_ctl01_fckContentBottomResizer">
												&nbsp;
											</div></td>
										</tr>
									</tbody>
								</table>
													<noscript>
									<p>RadEditor - please enable JavaScript to use the rich text editor.</p>
								</noscript></td>
							</tr>
											<tr>
								<td id="ctl06_ctl01_fckContentModule" class="reToolZone"></td>
							</tr>
											<tr>
								<td class="reWrapper_corner reCorner_bottom_left">&nbsp;</td>
												<td class="reWrapper_center reCenter_bottom" colspan="3">&nbsp;</td>
												<td class="reWrapper_corner reCorner_bottom_right">&nbsp;</td>
							</tr>
						</tbody>
					</table>
									<input id="ctl06_ctl01_fckContent_ClientState"
										name="ctl06_ctl01_fckContent_ClientState" type="hidden" />
				</div>
                        <span style="color: Red; font-size: 12px;">&nbsp;* </span>
                        <span id="ctl06_ctl01_RequiredFieldValidator2"
								title="Required" style="color: Red; display: none;"></span>
                    </td>
                </tr>
                <tr>
                    <td colspan="3" align="center" height="25px">
                        <input type="submit" name="ctl06$ctl01$btnSend"
								value="Send"
								onclick="javascript:WebForm_DoPostBackWithOptions(new WebForm_PostBackOptions(&quot;ctl06$ctl01$btnSend&quot;, &quot;&quot;, true, &quot;Feedback&quot;, &quot;&quot;, false, false))"
								id="ctl06_ctl01_btnSend" style="height: 25px; width: 50px;" />
                        <input type="submit"
								name="ctl06$ctl01$btnCancel" value="Cancel"
								id="ctl06_ctl01_btnCancel" style="height: 25px; width: 50px;" />
                    </td>
                </tr>


            </table>
        </div>
    </div>
</div>
<div id="ctl06_ctl01_rwUserLogin" style="display: none;">
					<div id="ctl06_ctl01_rwUserLogin_C">

					</div>
			<input id="ctl06_ctl01_rwUserLogin_ClientState"
				name="ctl06_ctl01_rwUserLogin_ClientState" type="hidden" />
				</div>
<script language="javascript" type="text/javascript">
    var dialogMethod;
    function CallWebMethodSuccess(results, context, methodName) {
        switch (methodName) {
            case "AllowWatchArticle":
                {
                    CheckUserWatchCallback(results, context, methodName);
                }
                break;
        }
    }

    function CallWebMethodFailed(results, context, methodName) {
        alert(results._message);
    }
    // check user login
    function getQuerystringNameValue(name) {
        // For example... passing a name parameter of "name1" will return a value of "100", etc.
        // page.htm?name1=100 or page.htm/name1/100
        var articleId;
        var winURL = window.location.href;
        var index = winURL.indexOf(name);
        if (index > -1) {
            winURL = winURL.substr(index, winURL.length);
            var arr = winURL.indexOf("index.html") > -1 ? winURL.split("index.html") : winURL.split("=");;
            articleId = arr[1];
        }
        return articleId;
    }
    function CheckUserWatchArticle() {
        PSCPortal.Services.CMS.AllowWatchArticle(getQuerystringNameValue("ArticleId"), CallWebMethodSuccess);
    }
    var dialogMethod;
    function CheckUserWatchCallback(results, context, methodName) {
        if (!results) {
            dialogMethod = "CheckUserWatchArticle";
            var oWnd = $find("ctl06_ctl01_rwUserLogin");
            oWnd.setSize(380, 180);
            oWnd.setUrl("/Modules/CMS/UserLogin.aspx");
            oWnd.set_title("Login");
            oWnd.show();
        }
    }
    function RadCheckUserWatchClose(sender, args) {
        switch (dialogMethod) {
            case "CheckUserWatchArticle":
                {
                    PSCPortal.Services.CMS.CheckUserWatchArticle(CallCheckUserWatchWebMethodSuccess);
                }
                break;
        }
    }
    function CallCheckUserWatchWebMethodSuccess(results, context, methodName) {
        if (!results)
            window.history.back();
    }
    //end check user login

    function pageLoad() {
        CheckUserWatchArticle();
    }
</script>
<style type="text/css">
.TelerikModalOverlay {
	filter: alpha(opacity = 95) !important; /*for IE 5.5+*/
	opacity: .95 !important; /*for FF 2x, Opera 9x*/
	-moz-opacity: .95 !important; /*for FF 1x*/
	background-color: #666666 !important;
}
</style>
			
	</jsp:body>
</t:templetepage>