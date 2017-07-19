package kr.co.mash_up.nine_tique.domain;

import javax.annotation.Generated;

import com.mysema.query.types.Path;
import com.mysema.query.types.PathMetadata;
import com.mysema.query.types.path.DateTimePath;
import com.mysema.query.types.path.EntityPathBase;
import com.mysema.query.types.path.EnumPath;
import com.mysema.query.types.path.ListPath;
import com.mysema.query.types.path.NumberPath;
import com.mysema.query.types.path.PathInits;
import com.mysema.query.types.path.StringPath;

import static com.mysema.query.types.PathMetadataFactory.forVariable;


/**
 * QPromotion is a Querydsl query type for Promotion
 */
@Generated("com.mysema.query.codegen.EntitySerializer")
public class QPromotion extends EntityPathBase<Promotion> {

    private static final long serialVersionUID = 1878581424L;

    public static final QPromotion promotion = new QPromotion("promotion");

    public final QAbstractEntity _super = new QAbstractEntity(this);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdAt = _super.createdAt;

    public final StringPath description = createString("description");

    public final DateTimePath<java.time.LocalDateTime> endAt = createDateTime("endAt", java.time.LocalDateTime.class);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath name = createString("name");

    public final NumberPath<Integer> priority = createNumber("priority", Integer.class);

    public final ListPath<PromotionImage, QPromotionImage> promotionImages = this.<PromotionImage, QPromotionImage>createList("promotionImages", PromotionImage.class, QPromotionImage.class, PathInits.DIRECT2);

    public final ListPath<PromotionProduct, QPromotionProduct> promotionProducts = this.<PromotionProduct, QPromotionProduct>createList("promotionProducts", PromotionProduct.class, QPromotionProduct.class, PathInits.DIRECT2);

    public final StringPath register = createString("register");

    public final DateTimePath<java.time.LocalDateTime> startAt = createDateTime("startAt", java.time.LocalDateTime.class);

    public final EnumPath<Promotion.Status> status = createEnum("status", Promotion.Status.class);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updatedAt = _super.updatedAt;

    public QPromotion(String variable) {
        super(Promotion.class, forVariable(variable));
    }

    public QPromotion(Path<? extends Promotion> path) {
        super(path.getType(), path.getMetadata());
    }

    public QPromotion(PathMetadata<?> metadata) {
        super(Promotion.class, metadata);
    }

}

