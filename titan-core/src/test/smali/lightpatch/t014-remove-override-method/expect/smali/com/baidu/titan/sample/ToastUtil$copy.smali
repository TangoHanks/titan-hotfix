.class public Lcom/baidu/titan/sample/ToastUtil$copy;
.super Lcom/baidu/titan/sample/ToastDad;


# instance fields

.field private mContext:Landroid/content/Context;


# direct methods

.method public constructor <init>(Landroid/content/Context;I)V
    .param p1    # Landroid/content/Context;
    .param p2    # I
    .locals 1


    add-int/lit8 v0, p2, 0x1

    invoke-direct {p0, v0}, Lcom/baidu/titan/sample/ToastDad;-><init>(I)V

    iput-object p1, p0, Lcom/baidu/titan/sample/ToastUtil$copy;->mContext:Landroid/content/Context;

    return-void


.end method

.method public static showToast(Landroid/content/Context;Ljava/lang/String;)V
    .param p0    # Landroid/content/Context;
    .param p1    # Ljava/lang/String;
    .locals 1


    const/4 v0, 0x0

    invoke-static {p0, p1, v0}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    return-void


.end method
